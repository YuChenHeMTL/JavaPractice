package array;

public class SortingAlgorithms {
    public static void main(String[] args) {
        //todo: algorithms
        int[] init = new int[5];
        for (int i = 0; i < init.length; i++){
            init[i] = (int) (Math.random() * 100);
        }
        for (int i : init){
            System.out.print(i + " ");
        }
        System.out.print("\n");

        //法正排序
        int[] a = init.clone();
        for (int i = 0; i < a.length - 1; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[j] < a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i : a){
            System.out.print(i + " ");
        }
        System.out.print("\n");

        //冒泡倒排序
        int[] b = init.clone();
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b.length - i - 1; j++){
                if (b[j] > b[j+1]){
                    int temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
        }
        for (int i : a){
            System.out.print(i + " ");
        }
    }
}
