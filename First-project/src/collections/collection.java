package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collection {
    public static void main(String[] args) {
        //初始化集合numbers
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("集合中的数据:");
        System.out.println(numbers);

        //todo: reverse - reverse the arrayList
        Collections.reverse(numbers);

        System.out.println("翻转后集合中的数据:");
        System.out.println(numbers);

        //todo: shuffle - randomize the order of the collection
        Collections.shuffle(numbers);

        System.out.println("混淆后集合中的数据:");
        System.out.println(numbers);

        //todo: sort
        Collections.sort(numbers);
        System.out.println("排序后集合中的数据:");
        System.out.println(numbers);

        //todo: swap - swap the items indicated at the two indexes
        Collections.swap(numbers,0,5);
        System.out.println("交换0和5下标的数据后，集合中的数据:");
        System.out.println(numbers);

        //todo: practice
        int piNum = 0;
        for (int i = 0; i < 1000000; i++){
            Collections.shuffle(numbers);
            if (numbers.get(0) == 3 && numbers.get(1) == 1 && numbers.get(2) == 4) piNum++;
        }
        System.out.println(piNum);
    }
}
