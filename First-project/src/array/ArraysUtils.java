package array;

import java.util.Arrays;

public class ArraysUtils {
    public static void main(String[] args) {
        //todo: arrayUtils

        //copyOfRange
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };

        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        int[] b = Arrays.copyOfRange(a, 0, 3);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        //toString
        int c[] = new int[] { 18, 62, 68, 82, 65, 9 };
        String content = Arrays.toString(c);
        System.out.println(content);

        //sort && binarySearch
        int s[] = new int[] { 18, 62, 68, 82, 65, 9 };

        Arrays.sort(s);

        System.out.println(Arrays.toString(s));
        //使用binarySearch之前，必须先使用sort进行排序
        System.out.println("数字 62 出现的位置: "+Arrays.binarySearch(s, 62));

        //equals (array comparison)
        int a1[] = new int[] { 18, 62, 68, 82, 65, 9 };
        int b1[] = new int[] { 18, 62, 68, 82, 65, 8 };

        System.out.println(Arrays.equals(a1, b1));

        //fill array
        int a2[] = new int[10];

        Arrays.fill(a2, 5);

        System.out.println(Arrays.toString(a2));

    }
}
