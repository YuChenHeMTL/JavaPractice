package string;

//todo: string properties

import java.util.Arrays;

public class strings {
    public char getRandomChar(){
        int rchar = 0;
        while (rchar < 48 || (rchar > 57 && rchar < 65) || (rchar > 90 && rchar < 97) || rchar > 122){
            rchar = (int) (Math.random() * 100) + 22;
        }
        return (char) rchar;
    }

    public static String getRandomCharString(int num){
        strings strs = new strings();
        String s = "";
        for (int i = 0; i < num; i++){
            s += strs.getRandomChar();
        }
        return s;
    }

    public String[] sortString(){
        String[] ss = new String[5];
        for (int i = 0; i < ss.length; i++){
            ss[i] = getRandomCharString(5);
        }
        for (int i = 0; i < ss.length - 1; i++){
            for (int j = i + 1; j < ss.length; j++){
                int i1 = (int) Character.toLowerCase(ss[i].charAt(0));
                int j1 = (int) Character.toLowerCase(ss[j].charAt(0));
                if (j1 < i1){
                    String temp = ss[i];
                    ss[i] = ss[j];
                    ss[j] = temp;
                }
            }
        }
        return ss;
    }

    public String password(){
        String s3 = getRandomCharString(3);
        String newS = "";
        for (int i = 0; i < s3.length(); i++){
            for (int j = 65; j < 122; j++){
                if (j == (int)s3.charAt(i)){
                    newS += (char) j;
                }
            }
        }
        return newS;
    }
    public static void main(String[] args) {
        //todo:
        // 1. 每当有一个字面值出现的时候，虚拟机就会创建一个字符串
        // 2. 调用String的构造方法创建一个字符串对象
        // 3. 通过+加号进行字符串拼接也会创建新的字符串对象

        String garen ="盖伦"; //字面值,虚拟机碰到字面值就会创建一个字符串对象
        String teemo = new String("提莫"); //创建了两个字符串对象
        char[] cs = new char[]{'崔','斯','特'};
        String hero = new String(cs);//  通过字符数组创建一个字符串对象

        String hero3 = garen + teemo;//  通过+加号进行字符串拼接

        //todo: String类拥有final, 所以不能被继承
        //这里会报错，因为String不能被继承
//        static class MyString extends String{
//        }

        //todo: 一旦生成，String的表现像是“常量”
        // 不可改变的具体含义是指：
        // 不能增加长度
        // 不能减少长度
        // 不能插入字符
        // 不能删除字符
        // 不能修改字符
        // 一旦创建好这个字符串，里面的内容 永远 不能改变
        // once instantiated, strings behave as a constant
        String g = "盖伦";

        //48-57, 65-90, 97-122
        strings strs = new strings();
        System.out.println(strs.getRandomCharString(5));
        System.out.println(Arrays.toString(strs.sortString()));
        System.out.println(strs.password());
    }
}
