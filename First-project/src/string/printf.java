package string;

import java.util.Locale;
import java.util.Scanner;

public class printf {
    public static void main(String[] args) {

        String name ="盖伦";
        int kill = 8;
        String title="超神";
        //todo: 格式化输出 - print formatting

        //直接使用+进行字符串连接，编码感觉会比较繁琐，并且维护性差,易读性差
        String sentence = name+ " 在进行了连续 " + kill + " 次击杀后，获得了 " + title +" 的称号";
        System.out.println(sentence);

        //使用格式化输出
        //%s表示字符串，%d表示数字,%n表示换行
        //%s : strings, %d: integers, %n: newline character
        String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
        //使用printf格式化输出
        System.out.printf(sentenceFormat,name,kill,title);
        //使用format格式化输出
        System.out.format(sentenceFormat,name,kill,title);

        //todo: 总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达

        int year = 2020;
        //总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达

        //直接打印数字
        System.out.format("%d%n",year);        //2020
        //总长度是8,默认右对齐
        System.out.format("%8d%n",year);       //    2020
        //总长度是8,左对齐
        System.out.format("%-8d%n",year);      //2020
        //总长度是8,不够补0
        System.out.format("%08d%n",year);      //00002020
        //千位分隔符
        System.out.format("%,8d%n",year*10000);//20,200,000

        //小数点位数
        System.out.format("%.2f%n",Math.PI);   //3.14

        //不同国家的千位分隔符
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000); //31 415,93
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);     //31,415.93
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);     //31,415.93

        Scanner s = new Scanner(System.in);
        System.out.println("请输入地名：");
        String locale = s.nextLine();
        System.out.println("请输入公司类型：");
        String companyFormat = s.nextLine();
        System.out.println("请输入公司名称：");
        String companyName = s.nextLine();
        System.out.println("请输入老板名称：");
        String boss = s.nextLine();
        System.out.println("请输入金额：");
        int amount = s.nextInt();
        System.out.println("请输入产品：");
        String product = s.nextLine();
        System.out.println("请输入价格计量单位：");
        String scale = s.nextLine();

        String format = "%s最大%s %s倒闭了，王八蛋老板%s吃喝嫖赌，%n" +
                "欠下了%d个亿，带着他的小姨子跑了!我们没有办法，拿着%s%n" +
                "抵工资!原价都是一%s多、两%s多、三%s多的%s，现在全部只卖二十块，统统只要二十块!%n" +
                "%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!%n";

        System.out.format(format, locale, companyFormat, companyName, boss, amount, product,
                scale, scale, scale, product, boss);
    }
}
