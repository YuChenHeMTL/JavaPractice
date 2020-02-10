package IOFile;

import java.io.*;

public class readerWriter {
    public static void main(String[] args){
        // 准备文件lol.txt其中的内容是AB
        File f = new File("");
        // 创建基于文件的Reader
        try (FileReader fr = new FileReader(f)) {
            // 创建字符数组，其长度就是文件的长度
            char[] all = new char[(int) f.length()];
            // 以字符流的形式读取文件所有内容
            fr.read(all);
            for (char b : all) {
                // 打印出来是A B
                System.out.println(b);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //todo: practice
        File fin = new File("D:\\hallo.txt");
        File fout = new File("D:\\hello.txt");
        File fdecoded = new File("D:\\heello.txt");
        try {
            encodeFile(fin, fout);
            decodeFile(fout, fdecoded);
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void encodeFile(File encodingFile, File encodedFile) throws IOException {
        if (encodingFile.length() == 0) return;
        File fin = new File(encodingFile.getAbsolutePath());
        char[] in = null;
        try(FileReader fr = new FileReader(fin)){
            in = new char[(int)fin.length()];
            fr.read(in);
            System.out.println("Input file content to encode:");
            printArray(in);
            for (int i = 0; i < in.length; i++){
                in[i] = encodeChar(in[i]);
            }
            System.out.println("Output encoded content:");
            printArray(in);
        } catch (IOException e){
            e.printStackTrace();
        }
        File fout = new File(encodedFile.getAbsolutePath());
        try (FileWriter fw = new FileWriter(fout)){
            if (null != in) fw.write(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void decodeFile(File decodingFile, File decodedFile) throws IOException {
        if (decodingFile.length() == 0) return;
        File fin = new File(decodingFile.getAbsolutePath());
        char[] in = null;
        try(FileReader fr = new FileReader(fin)){
            in = new char[(int)fin.length()];
            fr.read(in);
            System.out.println("Input file content to decode:");
            printArray(in);
            for (int i = 0; i < in.length; i++){
                in[i] = decodeChar(in[i]);
            }
            System.out.println("Output decoded content:");
            printArray(in);
        } catch (IOException e){
            e.printStackTrace();
        }
        File fout = new File(decodedFile.getAbsolutePath());
        try (FileWriter fw = new FileWriter(fout)){
            if (null != in) fw.write(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static char encodeChar(char in){
        if (Character.isAlphabetic(in) || Character.isDigit(in)) {
            switch (in){
                case ('z'): return 'a';
                case ('Z'): return 'A';
                case ('9'): return '0';
                default: return (char) ((int) in + 1);
            }
        } else {
            return in;
        }
    }

    public static char decodeChar(char in){
        if (Character.isAlphabetic(in) || Character.isDigit(in)) {
            switch (in){
                case ('a'): return 'z';
                case ('A'): return 'Z';
                case ('0'): return '9';
                default: return (char) ((int) in - 1);
            }
        } else {
            return in;
        }
    }

    public static void printArray (char[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
        System.out.println();
    }
}
