package array;

public class ArrayCopy {
    public static void main(String[] args) {
        //todo: arrayCopy
        int[] first = new int[(int)(Math.random() * 10)];
        int[] second = new int[(int)(Math.random() * 10)];
        for (int i = 0; i < first.length; i++){
            first[i] = (int)(Math.random() * 100);
            System.out.print(first[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < second.length; i++){
            second[i] = (int)(Math.random() * 100);
            System.out.print(second[i] + " ");
        }
        System.out.print("\n");

        //System.arraycopy(src, srcPos, dest, destPos, copyLength)
        int[] dest = new int[first.length + second.length];
        System.arraycopy(first, 0, dest, 0, first.length); //拷贝first到dest
        System.arraycopy(second, 0, dest, first.length, second.length); //拷贝second到dest

        for (int each: dest){
            System.out.print(each + " ");
        }
        System.out.print("\n");

    }
}
