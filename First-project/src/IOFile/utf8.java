package IOFile;

import array.ArraysUtils;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class utf8 {
    public static String[] encodings = { "BIG5", "GBK", "GB2312", "UTF-8", "UTF-16", "UTF-32" };

    public static void main(String[] args) {
        String str = "中";
//        showCode(str);
        File hexFile = new File("D:\\hex.txt");
        try {
            decodeHex(hexFile);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void showCode(String str) {
        for (String encode : encodings) {
            showCode(str, encode);
        }
    }


    private static void showCode(String str, String encode) {
        try {
            System.out.printf("字符: \"%s\" 的在编码方式%s下的十六进制值是%n", str, encode);
            byte[] bs = str.getBytes(encode);

            for (byte b : bs) {
                int i = b&0xff;
                System.out.print(Integer.toHexString(i) + "\t");
            }
            System.out.println();
            System.out.println();
        } catch (UnsupportedEncodingException e) {
            System.out.printf("UnsupportedEncodingException: %s编码方式无法解析字符%s\n", encode, str);
        }
    }

    private static void decodeHex(File hexFile) throws IOException {
        byte[] array = {(byte)0xE5,(byte)0xB1,(byte)0x8c};
        String str = new String(array,"UTF-8");
        System.out.println(str);
        File f = new File("D:\\hexdecoded.txt");
        FileWriter fw = new FileWriter(f);
        char[] c = str.toCharArray();
        fw.write(c);
        fw.flush();
    }
}
