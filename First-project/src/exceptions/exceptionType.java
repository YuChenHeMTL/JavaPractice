package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptionType {
    public static void main(String[] args) {

        //todo: all exception types
        // Error
        //      - AWTError
        //      - VirtualMachineError
        //          - StackOverflowError
        //          - OutOfMemoryError
        // Exceptions
        //      - RuntimeException
        //          - ArithmeticException
        //          - NullPointerException
        //          - IndexOutOfBoundsException
        //      - IOException
        //          - EOFException
        //          - FileNotFoundException

        //todo: 可查异常 - CheckedException
        // 可查异常即必须进行处理的异常，要么try catch住,要么往外抛，谁调用，谁处理，比如 FileNotFoundException
        // 如果不处理，编译器，就不让你通过
        // needs to be caught or thrown, or else the program will not be built by the compiler

        File f= new File("d:/LOL.exe");

//        try{
//            System.out.println("试图打开 d:/LOL.exe");
//            new FileInputStream(f);
//            System.out.println("成功打开");
//        }
//        catch(FileNotFoundException e){
//            System.out.println("d:/LOL.exe不存在");
//            e.printStackTrace();
//        }

        //todo: 运行时异常 - RuntimeException
        // 不是必须进行try catch的异常
        // 即便不进行try catch，也不会有编译错误
        // does not need to be caught
        // will not be an error in the editor

        //todo: 常见运行时异常:
        // 除数不能为0异常 - ArithmeticException
        // 下标越界异常 - ArrayIndexOutOfBoundsException
        // 空指针异常 - NullPointerException

        //任何除数不能为0:ArithmeticException
//        int k = 5/0;
//
//        //下标越界异常：ArrayIndexOutOfBoundsException
//        int[] j = new int[5];
//        j[10] = 10;
//
//        //空指针异常：NullPointerException
//        String str = null;
//        str.length();

        //todo: 运行时异常与非运行时异常的区别：
        // 运行时异常是不可查异常，不需要进行显式的捕捉
        // 非运行时异常是可查异常，必须进行显式的捕捉，或者抛出

        //todo: difference between RuntimeExceptions and other exceptions:
        // RuntimeExceptions cannot be caught, but also does not require try catch for the program to execute
        // Non-RuntimeExceptions can be spotted and caught, but also requires explicit catching and throwing
        //      for the program to be executed
        // ex: in the next method, NullPointerException and OutOfMemoryException are caught,
        //     but it's only showing the stack trace of OutOfMemoryException

        method1();

        //todo: 系统级别的异常 - Error
        // most common - OutOfMemoryError
        StringBuffer sb =new StringBuffer();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sb.append('a');
        }

    }
    private static void method1 (){
        String str = null;

        try {
            str.toString();
        } catch (NullPointerException e) {
            System.out.println("捕捉到运行时异常: NullPointerException ");
        }

        StringBuffer sb = new StringBuffer("1234567890");
        try {
            for (int i = 0; i < 100; i++) {
                sb.append(sb.toString());
            }
        } catch (OutOfMemoryError e) {
            System.out.println("捕捉到内存用光错误:  OutOfMemoryError");
        }
    }
}
