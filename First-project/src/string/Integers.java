package string;

public class Integers {
    public static void main(String[] args) {
        int i = 5;
        //int : primitive class
        //Integer : super class of int
        //Number : super class of Integer

        //基本类型转换成封装类型
        //todo: boxing
        Integer it = new Integer(i);

        //自动转换就叫装箱
        //todo: automatic boxing
        Integer it2 = i;

        //自动转换就叫拆箱
        //todo: automatic unboxing
        int i3 = it;

        //int的最大值
        System.out.println(Integer.MAX_VALUE);
        //int的最小值
        System.out.println(Integer.MIN_VALUE);
    }
}
