package array;

import javafx.util.Pair;

public class TwoDimensionArray {
    public static void main(String[] args) {
        //todo: 二维数组
        int[][] init = new int[5][5];
        for (int i = 0; i < init.length; i++){
            for (int j = 0; j < init[i].length; j++){
                init[i][j] = (int)(Math.random()* 100);
            }
        }
        int largest = init[0][0];
        Pair<Integer, Integer> coord = new Pair<>(0, 0);
        for (int i = 0; i < init.length; i++){
            for (int j = 0; j < init[i].length; j++){
                if (init[i][j] > largest){
                    largest = init[i][j];
                    coord = new Pair<>(i, j);
                }
            }
        }
        System.out.println("找到出最大的数是：" + largest);
        System.out.println("其坐标是：" + "[" + coord.getKey() + "][" + coord.getValue() + "]");

    }
}
