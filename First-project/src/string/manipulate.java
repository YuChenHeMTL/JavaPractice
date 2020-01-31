package string;

import java.util.Arrays;

public class manipulate {
    public static void main(String[] args) {
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";

        //todo: charAt(int index)
        // 获取指定位置的字符
        char c = sentence.charAt(0);
        System.out.println(c);

        //todo: toCharArray()
        // 获取对应的字符数组
        char[] cs = sentence.toCharArray(); //获取对应的字符数组
        System.out.println(sentence.length() == cs.length);

        //todo: subString(int start = 0, int end)
        // 截取子字符串
        //截取从第3个开始的字符串 （基0）
        String subString1 = sentence.substring(3);
        //截取从第3个开始的字符串 （基0）
        //到5-1的位置的字符串
        //左闭右开
        String subString2 = sentence.substring(3,5);

        //todo: split(regex)
        // 根据分隔符进行分隔
        //根据,进行分割，得到3个子字符串
        String[] subSentences = sentence.split(",");
        for (String sub : subSentences) {
            System.out.println(sub);
        }

        //todo: trim
        // 去掉首尾空格
        String noSpace = sentence.trim();

        //todo: toLowerCase 全部变成小写
        //      toUpperCase 全部变成大写
        System.out.println(sentence.toLowerCase());
        //全部变成大写
        System.out.println(sentence.toUpperCase());

        //todo: indexOf 判断字符或者子字符串出现的位置
        //      contains 是否包含子字符串
        System.out.println(sentence.indexOf('8')); //字符第一次出现的位置
        System.out.println(sentence.indexOf("超神")); //字符串第一次出现的位置
        System.out.println(sentence.lastIndexOf("了")); //字符串最后出现的位置
        System.out.println(sentence.indexOf(',',5)); //从位置5开始，出现的第一次,的位置
        System.out.println(sentence.contains("击杀")); //是否包含字符串"击杀"

        //todo: replaceAll 替换所有的
        //      replaceFirst 只替换第一个
        String temp = sentence.replaceAll("击杀", "被击杀"); //替换所有的
        temp = temp.replaceAll("超神", "超鬼");
        System.out.println(temp);

        temp = sentence.replaceFirst(",","");//只替换第一个
        System.out.println(temp);

        //todo: practice
        String light = "let there be light";
        System.out.println(light.toUpperCase());

        String rkl = "peter piper picked a peck of pickled peppers";
        String[] rkls = rkl.split(" ");
        int total = 0;
        for (int i = 0; i < rkls.length; i++){
            if (rkls[i].charAt(0) == 'p') total++;
        }
        System.out.println(total);

        String legendary = "legendary";
        char[] ls = legendary.toCharArray();
        for (int i = 0; i < ls.length; i += 2){
            ls[i] = Character.toUpperCase(ls[i]);
        }
        System.out.println(String.valueOf(ls));

        String l2 = legendary.substring(0, legendary.length() - 1);
        String lastL = String.valueOf(legendary.charAt(legendary.length() - 1)).toUpperCase();
        System.out.println(l2 + lastL);

        String twos = "Nature has given us that two ears, two eyes, " +
                "and but one tongue, to the end that we should hear and " +
                "see more than we speak";
        String two = "two";
        int location = twos.lastIndexOf(two);
        String firstHalf = twos.substring(0, location);
        String secondHalf = twos.substring(location + two.length(), twos.length());
        System.out.println(firstHalf + two.toUpperCase() + secondHalf);
    }
}
