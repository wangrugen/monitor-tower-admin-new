package com.iotplatform.utils;

public class NumberUtils {

    /**
     * 4进制16进制转化为浮点数
     * @param data
     * @return
     */

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

    public static float   IEEE754StrTofloat(String IEEE754Str){
        String prefix="0x";
        String str1=prefix+IEEE754Str.substring(0,2);
        String str2=prefix+IEEE754Str.substring(2,4);
        String str3=prefix+IEEE754Str.substring(4,6);
        String str4=prefix+IEEE754Str.substring(6,8);
        byte b1 = (byte) Integer.parseInt(str1.substring(2), 16);
        byte b2 = (byte) Integer.parseInt(str2.substring(2), 16);
        byte b3 = (byte) Integer.parseInt(str3.substring(2), 16);
        byte b4 = (byte) Integer.parseInt(str4.substring(2), 16);
        byte b [] =new byte [4];
        b[0]=b1;
        b[1]=b2;
        b[2]=b3;
        b[3]=b4;
        return bytesToFloat(b);
    }

    public static void main(String[] args) {
        String Str16="4F1EF841";
        System.out.print(StringToAsciiString("36"));

    }




    public String convertStringToHex(String str){

        char[] chars = str.toCharArray();

        StringBuffer hex = new StringBuffer();
        for(int i = 0; i < chars.length; i++){
            hex.append(Integer.toHexString((int)chars[i]));
        }

        return hex.toString();
    }

    public static  String StringToAsciiString(String hex){

        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        //49204c6f7665204a617661 split into two characters 49, 20, 4c...
        for( int i=0; i<hex.length()-1; i+=2 ){

            //grab the hex in pairs
            String output = hex.substring(i, (i + 2));
            //convert hex to decimal
            int decimal = Integer.parseInt(output, 16);
            //convert the decimal to character
            sb.append((char)decimal);

            temp.append(decimal);
        }

        return sb.toString();
    }


}
