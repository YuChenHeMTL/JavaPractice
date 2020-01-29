package string;

import java.util.Scanner;

public class character {
    //todo: char
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '1';//字符1,而非数字1
        char c3 = '中';//汉字字符
//        char c4 = 'ab'; //只能放一个字符

        Character c = c1; //自动装箱
        c1 = c;//自动拆箱

        System.out.println(Character.isLetter('a'));//判断是否为字母
        System.out.println(Character.isDigit('a')); //判断是否为数字
        System.out.println(Character.isWhitespace(' ')); //是否是空白
        System.out.println(Character.isUpperCase('a')); //是否是大写
        System.out.println(Character.isLowerCase('a')); //是否是小写

        System.out.println(Character.toUpperCase('a')); //转换为大写
        System.out.println(Character.toLowerCase('A')); //转换为小写

//        String a = 'a'; //不能够直接把一个字符转换成字符串
        String a2 = Character.toString('a'); //转换为字符串

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] cs = str.toCharArray();
        for (int i = 0; i < cs.length; i++){
            if (Character.isUpperCase(cs[i]) || Character.isDigit(cs[i])){
                System.out.print(cs[i]);
            }
        }
    }
}
