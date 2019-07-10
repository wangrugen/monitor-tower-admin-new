package com.iotplatform.receiveHexDecimal.service;

import com.iotplatform.picValidation.dao.PicValidationEntityMapper;
import com.iotplatform.picValidation.entity.PicValidationEntity;
import com.iotplatform.receiveHexDecimal.dao.PositionRecordEntityMapper;
import com.iotplatform.receiveHexDecimal.dao.ReceiveHexDecimalEntityMapper;
import com.iotplatform.receiveHexDecimal.entity.PositionRecordEntity;
import com.iotplatform.receiveHexDecimal.entity.ReceiveHexDecimalEntity;
import com.iotplatform.utils.NumberUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ReceiveHexDecimalService {

    //服务端socket
    private ServerSocket serverSocket;
    private String storeUrl ="";
    private String relativeUrl="";

    @Autowired
    private PositionRecordEntityMapper positionRecordEntityMapper;

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

    public void startUpReciverHexServerTool(int port ) {
        try {
            serverSocket = new ServerSocket(port);
            this.startTool();
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

    public void startTool() {
        while(true){
            Socket socket=null;
            try{
                socket=serverSocket.accept();                     //主线程获取客户端连接
                System.out.println("启动server成功");
                Thread workThread=new Thread(new HandlerTool(socket));    //创建线程
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
                BufferedInputStream  br = new BufferedInputStream(is);
                DataInputStream dis = new DataInputStream(br);
                byte[] bytes = new byte[1]; // 一次读取一个byte
                StringBuffer data = new StringBuffer();//获取到16进制数据
                while (dis.read(bytes) != -1) {
                    data.append(bytesToHexString(bytes));
                    System.out.println("数据输出："+bytesToHexString(bytes));
                    //如果传输的是84的倍数
                    if(data.length()>0&&data.toString().trim().length()%84==0){
                        String dataToStirngTotal =data.toString().trim();
                        String  M1 =dataToStirngTotal.substring(0,2);

                        String M2=dataToStirngTotal.substring(2,4);

                        String IMEI =dataToStirngTotal.substring(4,34);

                        String  shijian=dataToStirngTotal.substring(34,46);

                        String time =handleTime(shijian);

                        String zhiliang=dataToStirngTotal.substring(46,48);

                        float weidu=getNeedFloat(NumberUtils.IEEE754StrTofloat(dataToStirngTotal.substring(48,56)));
                        float jingdu=getNeedFloat(NumberUtils.IEEE754StrTofloat(dataToStirngTotal.substring(56,64)));
                        float gaodu=NumberUtils.IEEE754StrTofloat(dataToStirngTotal.substring(64,72));

                        String DW=dataToStirngTotal.substring(72,74);
                        String NS=dataToStirngTotal.substring(74,76);
                        String EW=dataToStirngTotal.substring(76,78);
                        String WX=getWX(dataToStirngTotal.substring(78,80));
                        String DY=getDY(dataToStirngTotal.substring(80,82));
                        String HE=dataToStirngTotal.substring(82,84);
                        PositionRecordEntity entity  =new PositionRecordEntity()  ;
                        entity.setCreateTime(new Date());
                        entity.setM1(M1);
                        entity.setM2(M2);
                        entity.setImei(IMEI);
                        entity.setShiJian(time);
                        entity.setXinHaoZhiLiang(zhiliang);
                        entity.setWeiDu(String .valueOf(weidu));
                        entity.setJingDu(String .valueOf(jingdu));
                        entity.setGaoDu(String .valueOf(gaodu));
                        entity.setDw(DW);
                        entity.setNs(NS);
                        entity.setEw(EW);
                        entity.setWx(WX);
                        entity.setDy(DY);
                        entity.setHe(HE);
                        positionRecordEntityMapper.insert(entity);
                        System.out.print("插入成功");
                        data=new StringBuffer();
                    }
                }
                System.out.println("数据总接收："+data.toString());
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

    class HandlerTool implements Runnable{
        private Socket clientSocket;
        public HandlerTool(Socket socket){
            this.clientSocket=socket;
        }
        public void run(){
            try{
                System.out.println("工具客户端连接:" + clientSocket.getLocalSocketAddress().toString());
                InputStream is = clientSocket.getInputStream();
                BufferedInputStream  br = new BufferedInputStream(is);
                DataInputStream dis = new DataInputStream(br);
                byte[] buf = new byte[1024];
                int line = 0;
                StringBuffer  data =new StringBuffer();
                while ((line = br.read()) != -1) {
                    data.append((char) line);
                    System.out.println("工具客户端数据输出："+data.toString().trim());
                    //如果传输的是84的倍数
                    if(data.length()>0&&data.toString().trim().length()%84==0){
                        String dataToStirngTotal =data.toString().trim();
                        String  M1 =dataToStirngTotal.substring(0,2);

                        String M2=dataToStirngTotal.substring(2,4);

                        String IMEI =dataToStirngTotal.substring(4,34);

                        String  shijian=dataToStirngTotal.substring(34,46);

                        String time =handleTime(shijian);

                        String zhiliang=dataToStirngTotal.substring(46,48);

                        float weidu=getNeedFloat(NumberUtils.IEEE754StrTofloat(dataToStirngTotal.substring(48,56)));
                        float jingdu=getNeedFloat(NumberUtils.IEEE754StrTofloat(dataToStirngTotal.substring(56,64)));
                        float gaodu=NumberUtils.IEEE754StrTofloat(dataToStirngTotal.substring(64,72));

                        String DW=dataToStirngTotal.substring(72,74);
                        String NS=dataToStirngTotal.substring(74,76);
                        String EW=dataToStirngTotal.substring(76,78);
                        String WX=getWX(dataToStirngTotal.substring(78,80));
                        String DY=getDY(dataToStirngTotal.substring(80,82));
                        String HE=dataToStirngTotal.substring(82,84);
                        PositionRecordEntity entity  =new PositionRecordEntity()  ;
                        entity.setCreateTime(new Date());
                        entity.setM1(M1);
                        entity.setM2(M2);
                        entity.setImei(IMEI);
                        entity.setShiJian(time);
                        entity.setXinHaoZhiLiang(zhiliang);
                        entity.setWeiDu(String .valueOf(weidu));
                        entity.setJingDu(String .valueOf(jingdu));
                        entity.setGaoDu(String .valueOf(gaodu));
                        entity.setDw(DW);
                        entity.setNs(NS);
                        entity.setEw(EW);
                        entity.setWx(WX);
                        entity.setDy(DY);
                        entity.setHe(HE);
                        positionRecordEntityMapper.insert(entity);
                        System.out.print("插入成功");
                        data=new StringBuffer();
                    }
                }
                System.out.println("数据总接收："+data.toString());
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


    public static float bytesToFloat(byte[] data) {// 解析4个字节中的数据，按照IEEE754的标准
        int s = 0;// 浮点数的符号
        float f = 0;// 浮点数
        int e = 0;// 指数
        if ((data[3] & 0xff) >= 128) {// 求s
            s = -1;
        } else {
            s = 1;
        }
        int temp = 0;// 指数位的最后一位
        if ((data[2] & 0xff) >= 128) {
            temp = 1;
        } else
            temp = 0;
        e = ((data[3] & 0xff) % 128) * 2 + temp;// 求e
        // f=((data[2]&0xff)-temp*128+128)/128+(data[1]&0xff)/(128*256)+(data[0]&0xff)/(128*256*256);
        float[] data2 = new float[3];
        data2[0] = data[0] & 0xff;
        data2[1] = data[1] & 0xff;
        data2[2] = data[2] & 0xff;
        f = (data2[2] - temp * 128 + 128) / 128 + data2[1] / (128 * 256)
                + data2[0] / (128 * 256 * 256);
        float result = 0;
        if (e == 0 && f != 0) {// 次正规数
            result = (float) (s * (f - 1) * Math.pow(2, -126));
            return result;
        }
        if (e == 0 && f == 0) {// 有符号的0
            result = (float) 0.0;
            return result;
        }
        if (s == 0 && e == 255 && f == 0) {// 正无穷大
            result = (float) 1111.11;
            return result;
        }
        if (s == 1 && e == 255 && f == 0) {// 负无穷大
            result = (float) -1111.11;
            return result;
        } else {
            result = (float) (s * f * Math.pow(2, e - 127));
            return result;
        }

    }


    private static  float  getNeedFloat(float  number){

        String numberStr=Float.valueOf(number).toString();
        int startPostion =numberStr.indexOf(".")-2;
        String zhengshu=numberStr.substring(0,startPostion);
        String xiaoshu=numberStr.substring(startPostion,numberStr.length());

        BigDecimal  decimal1 =new BigDecimal(zhengshu);
        BigDecimal  decimal2 =new BigDecimal(xiaoshu);
        decimal2=decimal2.divide(new BigDecimal(60),6, RoundingMode.HALF_UP);
        return decimal1.add(decimal2).floatValue();
    }

    public static  String handleTime(String shijian){
        String time ="";
        int j=0;
        for (int i=0;i<shijian.length()/2;i++){
            String str = NumberUtils.StringToAsciiString(shijian.substring(j,j+2));
            time=time+str;
            j=j+2;
        }
        return time;
    }

    public static String bytesToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(0xFF & bytes[i]);
            if (hex.length() == 1) {
                sb.append('0');
            }
            sb.append(hex);
        }
        return sb.toString();
    }

    public String getDY(String DY){

        return  String.valueOf(new BigInteger(DY, 16).floatValue()/10) ;
    }

    public String getWX(String DY){

        return  String.valueOf(new BigInteger(DY, 16)) ;
    }

    public static  void main (String args[]){

        System.out.print(new BigInteger("25", 16).floatValue()/10);

    }
}
