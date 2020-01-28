package array;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[][] initial = new int[5][8];
        for (int i = 0; i < initial.length; i++){
            for (int j = 0; j < initial[i].length; j++){
                initial[i][j] = (int)(Math.random() * 100);
            }
        }
        int[] flat = new int[5 * 8];
        for (int i = 0; i < initial.length; i++){
            System.arraycopy(initial[i], 0, flat, i * 8, 8);
        }
        Arrays.sort(flat);
        for (int i = 0; i < initial.length; i++){
            System.arraycopy(flat, i * 8, initial[i], 0, 8);
            System.out.println(Arrays.toString(initial[i]));
        }
    }
}
