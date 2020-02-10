package collections.otherCollections;

import java.util.*;

import static string.strings.getRandomCharString;

public class hashSet {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();

        names.add("gareen");

        System.out.println(names);

        //第二次插入同样的数据，是插不进去的，容器中只会保留一个
        names.add("gareen");
        System.out.println(names);

        HashSet<Integer> numbers = new HashSet<Integer>();

        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }

        //Set不提供get方法来获取指定位置的元素
        //numbers.get(0)

        //遍历Set可以采用迭代器iterator
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer i = (Integer) iterator.next();
//            System.out.println(i);
        }

        //或者采用增强型for循环
        for (Integer i : numbers) {
//            System.out.println(i);
        }

        //todo: practice
        String[] randomStrings = new String[100];
        for (int i = 0; i < randomStrings.length; i++){
            randomStrings[i] = getRandomCharString(2);
        }

        Date now = new Date();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < randomStrings.length - 1; i++){
            for (int j = i + 1; j < randomStrings.length; j++){
                if (randomStrings[i].equals(randomStrings[j])) {
                    strings.add(randomStrings[i]);
                }
            }
        }
        System.out.println("In " + (new Date().getTime() - now.getTime()) + "ms, Found " + strings.size() + " repeated strings: " + strings.toString());

        now = new Date();
        HashSet<String> hs = new HashSet<>();
        strings.clear();
        for (int i = 0; i < randomStrings.length; i++){
            if (!hs.contains(randomStrings[i])) {
                hs.add(randomStrings[i]);
            } else {
                strings.add(randomStrings[i]);
            }
        }
        System.out.println("In " + (new Date().getTime() - now.getTime()) + "ms, Found " + strings.size() + " repeated strings: " + strings.toString());
    }
}
