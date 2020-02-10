package IOFile;

import java.io.*;

public class bufferedPrintWriter {
    public static void main(String[] args) {
        // 准备文件lol.txt其中的内容是
        // garen kill teemo
        // teemo revive after 1 minutes
        // teemo try to garen, but killed again
        File f = new File("d:/lol.html");
        // 创建文件字符流
        // 缓存流必须建立在一个存在的流的基础上
        try (
                BufferedReader br = new BufferedReader(new FileReader(f));

                // 创建文件字符流
                // 缓存流必须建立在一个存在的流的基础上
                PrintWriter pw = new PrintWriter(new FileWriter(f));
        )
        {
//            pw.println("garen kill teemo");
//            //强制把缓存中的数据写入硬盘，无论缓存是否已满
//            pw.flush();
//            pw.println("teemo revive after 1 minutes");
//            pw.println("teemo try to garen, but killed again");
            String line;
            while((line=br.readLine()) != null)
            {
                System.out.println(line);
            }
//            removeComments(f);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void removeComments(File javaFile){
        if (null == javaFile || javaFile.length() == 0) {
            System.out.println("javaFile not valid");
            return;
        }
        try(
                FileReader fr = new FileReader(javaFile.getAbsolutePath());
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(javaFile.getAbsolutePath());
                PrintWriter pw = new PrintWriter(fw);
                ){
            int commentCount = 0;
            while (true) {
                String line = br.readLine();
                if (null == line)
                    break;
                System.out.println(line);
//                if (line.trim().indexOf("\\\\") == 0){
//                    commentCount++;
//                } else {
//                    pw.println(line);
//                }
            }
//            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
