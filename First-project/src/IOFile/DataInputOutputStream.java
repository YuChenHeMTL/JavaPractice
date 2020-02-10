package IOFile;

import java.io.*;

public class DataInputOutputStream {
    public static void main(String[] args) {
        File f = new File("D:\\lol.txt");
        writeTwoIntData(f, 31, 13);
        writeTwoIntBuffer(f, 1, 2);
    }

    public static void writeTwoIntData(File f, int first, int second){
        if (null == f) return;
        try (
                DataOutputStream dos =new DataOutputStream(new FileOutputStream(f));
                ) {
            dos.writeInt(first);
            dos.writeInt(second);
            System.out.println("written as dataOutput");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (
                DataInputStream dis =new DataInputStream(new FileInputStream(f));
                ){
            int firstRead = dis.readInt();
            int secondRead = dis.readInt();
            System.out.printf("first int: %d, second int: %d %n", firstRead, secondRead );
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeTwoIntBuffer(File f, int first, int second){
        if (null == f ) return;
        try (
                PrintWriter pw = new PrintWriter(new FileWriter(f));
        ) {
            pw.println(first);
            pw.println(second);
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
                BufferedReader br = new BufferedReader(new FileReader(f));
                ){
            int firstRead = Integer.parseInt(br.readLine());
            int secondRead = Integer.parseInt(br.readLine());
            System.out.printf("first int: %d, second int: %d %n", firstRead, secondRead );
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
