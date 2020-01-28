import java.util.Scanner;

public class Operations {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); //only need to be initiated once at the start
//        System.out.println("请输入你的体重：");
//        int weight = s.nextInt();
//        System.out.println("请输入你的身高：");
//        float height = s.nextFloat();
//        System.out.println("你的BMI是: " + (weight/(height*height)));

//        int first = s.nextInt();
//        System.out.println("第一个整数：" + first);
//        int second = s.nextInt();
//        System.out.println("第二个整数：" + second);
//        System.out.println("比较 " + first + ">" + second + ":" + (first > second));
//        System.out.println("比较 " + first + ">=" + second + ":" + (first >= second));
//        System.out.println("比较 " + first + "<" + second + ":" + (first < second));
//        System.out.println("比较 " + first + "<=" + second + ":" + (first <= second));
//        System.out.println("比较 " + first + "==" + second + ":" + (first == second));
//        System.out.println("比较 " + first + "!=" + second + ":" + (first != second));

        int i = 5;
        int j = 6;
        String ib = Integer.toBinaryString(i);
        String jb = Integer.toBinaryString(j);

        System.out.println(Integer.toBinaryString(i)); //5的二进制是101
        System.out.println(Integer.toBinaryString(j)); //6的二进制是110

        System.out.println(i|j); //所以 5|6 对每一位进行或运算，得到 111->7
        System.out.println(i&j); //所以 5&6 对每一位进行与运算，得到 100->4
        System.out.println(i^j); //所以 5^6 对每一位进行或运算，得到 011->3

        System.out.println(i^0); // == 0
        System.out.println(i^i); // == i

        System.out.println(Integer.toBinaryString(i)); //5的二进制是00000101,所以取非即为11111010,即为-6
        System.out.println(~i);

        System.out.println(Integer.toBinaryString(i));
        //6向左移1位后，变成1100，对应的10进制是12
        System.out.println(i<<1);
        //6向右移1位后，变成11，对应的10进制是3
        System.out.println(i>>1);

        System.out.println(2 << 4);

        //-10的二进制是11111111111111111111111111110110
        //第一位是1，即符号位，代表这是一个负数
        System.out.println(Integer.toBinaryString(i));

        //对于正数， 带符号右移 >> 会把所有的位右移，并在最前面补0
        //对于负数， 带符号右移 >> 会把所有的位右移，并在最前面补1

        //-10带符号右移1位，移动后前面补齐1
        //得到11111111111111111111111111111011
        //因为第一位是1，所以依然是一个负数，对应的十进制是-5
        int l = i>>1;
        System.out.println(Integer.toBinaryString(l));
        System.out.println(l);

        //-10无符号向右移1位，符号位也会向右移，第一位就变成了0
        //得到01111111111111111111111111111011，对应的十进制是2147483643
        int k = i>>>1;
        System.out.println(Integer.toBinaryString(k));

        System.out.println(k);
    }
}
