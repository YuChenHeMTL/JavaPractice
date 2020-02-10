package IOFile;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class stream {
    public static void main(String[] args) {
        try {
            String str="Hello,Java!";
            char[] cha=str.toCharArray();
            byte[] data=new byte[cha.length];
            int index=0;
            for(char i:cha) {
                data[index++]=(byte)i;
            }
//            File f = new File("d:/lol.txt");
            // 创建基于文件的输入流
//            FileInputStream fis = new FileInputStream(f);
            // 通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，也就是读取到内存中
            File o = new File("D:\\Documents\\newFile.txt");
            FileOutputStream fos = new FileOutputStream(o);

            // 准备文件lol2.txt其中的内容是空的
            File f = new File("d:/lol2.txt");
            // 准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
//            byte[] data = { 88, 89 };

            // 创建基于文件的输出流
            fos = new FileOutputStream(f);
            // 把数据写入到输出流
//            fos.write(data);
            // 关闭输出流
            fos.close();

            //todo: practice

            f = new File("d:/lol/lol2.txt");
            File pf = f.getParentFile();
            if (!pf.exists()){
                pf.mkdirs();
            }
            fos = new FileOutputStream(f);
            fos.write(data);
            fos.close();

            f = new File("C:\\Program Files\\TencentGame\\LOL\\LOL卸载.exe");
            File[] split = splitFiles(f, 1024*1000);
            assembleFiles(split);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static File[] splitFiles(File f, int size) throws IOException{
        // 分割文件，每个size 字节大小

        // 源文件大小
        long length  = f.length();
        if(length == 0)
            throw new RuntimeException("文件长度为零");

        //分割文件个数
        int splitFileNumber = (int) Math.ceil(length * 1.0 / size);
        FileInputStream fis = null;
        byte[] fileData = new byte[0];
        try {
            fis = new FileInputStream(f);
            fileData  = new byte[(int)(length)];
            fis.read(fileData);
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (null != fis){
                try{
                    fis.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        File[] allSubFiles = new File[splitFileNumber];

        // 写入到分割文件之中
        for(int i = 0; i < splitFileNumber; i++){
            FileOutputStream fos = null;
            try{
                fos = new FileOutputStream("D:\\"+ f.getName() + "-" + i);
                allSubFiles[i] = new File("D:\\"+ f.getName() + "-" + i);
                if(i == splitFileNumber - 1){
                    // 如果是最后一个文件,其大小未必由size 字节
                    fos.write(fileData,i * size,fileData.length - i * size);
                    //write(from fileData, offset : i * size, length: total length - i * size)
                } else fos.write(fileData,i * size ,size);
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                if (null != fos){
                    try{
                        fos.close();
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        return allSubFiles;
    }

    public static void assembleFiles(File[] files) throws IOException {
        if (files.length == 0) return;
        String fullName = files[0].getName().substring(0, files[0].getName().length() - 2);
        long totalLength = 0;
        File f = new File("D:\\"+ fullName);
        for (File file : files) {
            totalLength += file.length();
        }
        byte[] data = new byte[(int) totalLength];

        for (int i = 0; i < files.length; i++){
            try (FileInputStream fis = new FileInputStream(files[i])){
                byte[] b = new byte[(int)files[i].length()];
                fis.read(b);
                System.arraycopy(b, 0, data, i* (int) files[0].length(), (int)files[i].length());
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        try (FileOutputStream fos = new FileOutputStream(f)){
            fos.write(data);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
