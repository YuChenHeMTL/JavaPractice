package string;

public class stringConversion {
    public static void main(String[] args) {
        int i = 5;

        //todo: 数字转字符串
        // int -> string
        //方法1: 使用String类的静态方法valueOf
        String str = String.valueOf(i);
        //方法2: 先把基本类型装箱为对象，然后调用对象的toString
        Integer it = i;
        String str2 = it.toString();

        //todo: 字符串转数字
        // string -> int
        str = "999";
        i= Integer.parseInt(str);

        System.out.println(i);

        //todo: practice

        //parsing a non-int string will give:
        //Exception in thread "main" java.lang.NumberFormatException: For input string: "3.14a4"
        System.out.println(Integer.parseInt("3.14a4"));
    }
}
