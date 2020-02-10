package collections.otherCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        //todo: HashSet = no particular order
        HashSet<Integer> numberSet1 =new HashSet<>();
        //HashSet中的数据不是按照插入顺序存放
        numberSet1.add(88);
        numberSet1.add(8);
        numberSet1.add(888);

        System.out.println(numberSet1);

        //todo: LinkedHashSet = ordered by input order
        LinkedHashSet<Integer> numberSet2 =new LinkedHashSet<>();
        //LinkedHashSet中的数据是按照插入顺序存放
        numberSet2.add(88);
        numberSet2.add(8);
        numberSet2.add(888);

        //todo: TreeSet: = ordered by input size (small to big)
        System.out.println(numberSet2);
        TreeSet<Integer> numberSet3 =new TreeSet<>();
        //TreeSet 中的数据是进行了排序的
        numberSet3.add(88);
        numberSet3.add(8);
        numberSet3.add(888);

        System.out.println(numberSet3);

        //todo: practice
        double start = Math.PI;
        LinkedHashSet<Integer> digits = new LinkedHashSet<>();
        HashSet<Integer> repeat = new HashSet<>();
        while(repeat.size() != 9){
            int digit = (int) start % 10;
            start = (start - digit) * 10;
            if (!repeat.contains(digit)){
                digits.add(digit);
                repeat.add(digit);
            }
        }
        System.out.println(digits);
    }
}
