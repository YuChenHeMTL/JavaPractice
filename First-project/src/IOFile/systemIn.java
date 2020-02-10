package IOFile;

import java.io.*;
import java.util.Scanner;

public class systemIn {
    public static String[] classNames = {"@class@", "@type@", "@property@", "@Uproperty@"};

    public static void main(String[] args) {
        String[] classModel = new String[4];
        Scanner s = new Scanner(System.in);
        System.out.println("The name of the class: ");
        classModel[0] = s.nextLine();
        System.out.println("The type of the class property: ");
        classModel[1] = s.nextLine();
        System.out.println("The name of the class property: ");
        classModel[2] = s.nextLine();
        classModel[3] = Character.toUpperCase(classModel[2].charAt(0)) + classModel[2].substring(1);

        File f = new File("C:\\Users\\yuche\\Documents\\my-projects\\JavaPractice\\First-project\\src\\class-model");
        File out = new File("D:\\" + classModel[0] + ".java");

        String[] model = new String[12];
        String in;

        try(
                BufferedReader br = new BufferedReader(new FileReader(f));
                PrintWriter pw = new PrintWriter(new FileWriter(out));
                ){
            int ite = 0;
            while((in = br.readLine()) != null){
                for (int i = 0; i < classNames.length; i++){
                    if (in.contains(classNames[i])) in = in.replaceAll(classNames[i], classModel[i]);
                }
                model[ite] = in;
                ite++;
                pw.println(in);
            }
            pw.flush();
            System.out.println("File stored at :" + out.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
