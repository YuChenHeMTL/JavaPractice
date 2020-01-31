package exceptions;

import java.io.File;
import java.io.FileInputStream;

public class throwable {
    public static void main(String[] args) {

        //todo: Throwable
        // all errors and exceptions are child classes of Throwable class

        File f = new File("d:/LOL.exe");

        try {
            method1();
            //使用Throwable进行异常捕捉
        } catch (Throwable t) {
            // TODO Auto-generated catch block
            System.out.println("cannot load LOL");
            t.printStackTrace();
        }

    }

    private static void method1() throws Throwable {
        File f = new File("d:/LOL.exe");
        new FileInputStream(f);
    }
}
