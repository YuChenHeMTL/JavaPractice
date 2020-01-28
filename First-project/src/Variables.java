public class Variables { //类
    //整型，没有小数点
    byte bytes;
    short shorts;
    int integers;
    long longNumbers;

    //字符型，存放一个字符（token）
    char c;

    //浮点型 float
    static float f = 54.321f; //最后f很重要
    static double d = 54.321;

    //boolean
    static boolean b = false; //不能是数字


    // String
    static String str = "Hello World!";

    public static void main(String[] args) {
        long val = 26L; //以L结尾的字面值表示long型
        int decVal = 26; //默认就是int型
        int hexVal = 0x1a; //16进制
        int oxVal = 032; //8进制
        int binVal = 0b11010; //2进制
        System.out.println(oxVal);

        float f1 = 123.4F;// 以F结尾的字面值表示float类型
        double d1 = 123.4;// 默认就是double类型
        double d2 = 1.234e2;// 科学计数法表示double

        String name = "盖伦";
        char a= 'c';

        //以下是转义字符
        char tab = '\t'; //制表符
        char carriageReturn = '\r'; //回车
        char newLine = '\n'; //换行
        char doubleQuote = '\"'; //双引号
        char singleQuote = '\''; //单引号
        char backslash = '\\'; //反斜杠

        //final: 如果使用，在第一次定义以后不能被更改（js：const）
        final int i;

        i = 10; //i在第4行，只是被声明，但是没有被赋值，所以在这里可以进行第一次赋值

//        i = 11; //i在第6行已经被赋值过了，所以这里会出现编译

    }

}
