package com.iotplatform.receiveHexDecimal.service;

import com.iotplatform.picValidation.dao.PicValidationEntityMapper;
import com.iotplatform.picValidation.entity.PicValidationEntity;
import com.iotplatform.receiveHexDecimal.dao.ReceiveHexDecimalEntityMapper;
import com.iotplatform.receiveHexDecimal.entity.ReceiveHexDecimalEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.UUID;

@Service
public class ReceiveHexDecimalService {

    //服务端socket
    private ServerSocket serverSocket;
    private String storeUrl ="";
    private String relativeUrl="";

    @Autowired
    private ReceiveHexDecimalEntityMapper receiveHexDecimalEntityMapper;

    @Autowired
    HttpServletRequest request; //这里可以获取到request

    public ReceiveHexDecimalService() {

    }

    public void startUpReciverHexServer(int port ) {
        try {
            serverSocket = new ServerSocket(port);
            this.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //服务器开启方法
    public void start() {
        while(true){
            Socket socket=null;
            try{
                socket=serverSocket.accept();                     //主线程获取客户端连接
                System.out.println("启动server成功");
                Thread workThread=new Thread(new Handler(socket));    //创建线程
                workThread.start();                                    //启动线程
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    class Handler implements Runnable{
        private Socket clientSocket;
        public Handler(Socket socket){
            this.clientSocket=socket;
        }
        public void run(){
            try{
                System.out.println("客户端连接:" + clientSocket.getLocalSocketAddress().toString());
                InputStream is = clientSocket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                byte[] buf = new byte[1024];
                int line = 0;
                StringBuffer data = new StringBuffer();//获取到16进制数据
                while ((line = is.read(buf)) != -1) {
                    data.append(new String(buf, 0, line));
                    System.out.println("数据："+data.toString());
                }
                System.out.println("数据总接收："+data.toString());

                if(StringUtils.isEmpty(data.toString())){
                    return ;
                }
                String dataToStirng =data.toString().trim();
                String begin=dataToStirng.substring(0,4);

                String  imei =dataToStirng.substring(4,34);

                String shijian=dataToStirng.substring(34,62);

                String jingdu =dataToStirng.substring(62,70);

                String  weidu=dataToStirng.substring(70,78);

                String gaodu=dataToStirng.substring(78,86);

                String beiyong=dataToStirng.substring(86,102);
                String end=dataToStirng.substring(102,104);

                ReceiveHexDecimalEntity  entity  =new ReceiveHexDecimalEntity()  ;
                entity.setBegin(begin);
                entity.setImei(imei);
                entity.setTime(shijian);
                entity.setJinGdu(jingdu);
                entity.setWeiDu(weidu);
                entity.setGaoDu(gaodu);
                entity.setBeiYong(beiyong);
                entity.setWeiDu(weidu);
                entity.setEnd(end);
                receiveHexDecimalEntityMapper.insert(entity);
                System.out.print("插入成功");
            }catch(Exception e){e.printStackTrace();}finally{
                try{
                    System.out.println("关闭连接:"+clientSocket.getInetAddress()+":"+clientSocket.getPort());
                    if(clientSocket!=null)clientSocket.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public String  getFileName (){
        return UUID.randomUUID().toString().replaceAll("-","")+".jpg";
    }

    /**
     * 16进制数成byte数据
     *
     * @param hexString
     * @return
     */
    public byte[] hexStringToBytes(String hexString) {
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        hexString = hexString.toUpperCase();
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return d;
    }

    private byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    public byte[] hex2byte(String str) { // 字符串转二进制
        if (str == null)
            return null;
        str = str.trim();
        int len = str.length();
        if (len == 0 || len % 2 == 1)
            return null;
        byte[] b = new byte[len / 2];
        try {
            for (int i = 0; i < str.length(); i += 2) {
                b[i / 2] = (byte) Integer.decode("0x" + str.substring(i, i + 2)).intValue();
            }
            return b;
        } catch (Exception e) {
            return null;
        }
    }


    public  byte[] hexToByteArray(String inHex) {
        int hexlen = inHex.length();
        byte[] result;
        if (hexlen % 2 == 1) {
            //奇数
            hexlen++;
            result = new byte[(hexlen / 2)];
            inHex = "0" + inHex;
        } else {
            //偶数
            result = new byte[(hexlen / 2)];
        }
        int j = 0;
        for (int i = 0; i < hexlen; i += 2) {
            result[j] = hexToByte(inHex.substring(i, i + 2));
            j++;
        }
        return result;
    }

    public  byte hexToByte(String inHex) {
        return (byte) Integer.parseInt(inHex, 16);
    }

    public static  void main (String args[]){

        String str= "0086682703006238400000050360462600028011000.000000000.000000041983003199015523";

        System.out.print(str.length());
    }


}
