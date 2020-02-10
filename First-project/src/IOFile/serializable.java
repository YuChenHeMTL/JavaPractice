package IOFile;

import java.io.*;

public class serializable {
    public static void main(String[] args) {
        //创建一个Hero garen
        //要把Hero对象直接保存在文件上，务必让Hero类实现Serializable接口
        SerializableHero h = new SerializableHero();
        h.name = "garen";
        h.hp = 616;

        //准备一个文件用于保存该对象
        File f =new File("d:/garen.lol");

        try(
                //创建对象输出流
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos =new ObjectOutputStream(fos);
                //创建对象输入流
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois =new ObjectInputStream(fis);
        ) {
            oos.writeObject(h);
            //puts the Hero Object h into the ObjectOutputStream
            SerializableHero h2 = (SerializableHero) ois.readObject();
            System.out.println(h2.name);
            System.out.println(h2.hp);

        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //todo: practice
        SerializableHero[] heros = new SerializableHero[10];
        for (int i = 0; i < heros.length; i++){
            heros[i] = new SerializableHero();
            heros[i].name = "garen" + i;
            heros[i].hp = (float) (Math.random() * 1000);
        }

        File herosFile = new File("D:\\heros.lol");
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(herosFile));
                ObjectInputStream ois =new ObjectInputStream(new FileInputStream(herosFile));
                ) {
            for (int i = 0; i < heros.length; i++){
                oos.writeObject(heros[i]);
            }
            for (int i = 0; i < heros.length; i++){
                SerializableHero h2 = (SerializableHero) ois.readObject();
                System.out.println(h2.name);
                System.out.println(h2.hp);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
