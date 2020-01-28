package array;

public class Array {
    public static void main(String[] args) {
        //声明一个引用
        int[] a;
        //创建一个长度是5的数组，并且使用引用a指向该数组
        a = new int[5];

        int[] b = new int[5]; //声明的同时，指向一个数组
        for (int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * 100);
        }
        System.out.println("数组中的各个随机数是:");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);

        int smallest = a[0];
        for (int i : a){
            if (i < smallest) smallest = i;
        }
        System.out.println("本练习的目的是，找出最小的一个值: " + smallest);

    }
}
