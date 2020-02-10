package IOFile.practice;

import java.io.*;

public class practice {

    public static void copyFile(String srcFile, String destFile){
        if (null == srcFile) return;
        File destF = new File(destFile);
        File srcF = new File(srcFile);
        String in = null;
        try(
                BufferedReader br = new BufferedReader(new FileReader(srcF));
                PrintWriter pw = new PrintWriter(new FileWriter(destF));
                ) {
            while((in = br.readLine()) != null){
                pw.println(in);
            }
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void copyFolder(String srcFolder, String destFolder){
        if (null == srcFolder) return;
        File src = new File(srcFolder);
        if (!src.exists()) return;
        File dest = new File(destFolder);
        if (src.isFile()){
            copyFile(srcFolder, destFolder);
        } else if (src.isDirectory()){
            if (!dest.exists()) dest.mkdir();
            File[] files = src.listFiles();
            for (int i = 0; i < files.length; i++){
                copyFolder(srcFolder + "\\" + files[i].getName(), destFolder + "\\" + files[i].getName());
            }
        }
    }

    public static void search(File folder, String search){
        if (null == folder || !folder.exists()) return;
        if (folder.isFile()){
            String in = null;
            try (
                    BufferedReader br = new BufferedReader(new FileReader(folder));
                    ) {
                while((in = br.readLine()) != null){
                    if (in.contains(search)) System.out.printf("Found \"%s\" in file with path %s", search, folder.getAbsolutePath());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (folder.isDirectory()){
            File[] allFiles = folder.listFiles();
            for(File f : allFiles){
                search(f, search);
            }
        }
    }

    public static void main(String[] args) {
        search(new File("C:\\Users\\yuche\\OneDrive - University of Waterloo\\Waterloo\\2A\\ECE 222"), "cache");
    }
}
