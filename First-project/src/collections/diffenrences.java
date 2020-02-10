package collections;

import array.Array;

import java.util.*;
import java.util.stream.Collectors;

public class diffenrences {
    public static void main(String[] args) {
        //------------------HashSet------------------
        //todo: difference with HashSet
        // 1. ArrayList is ordered while HashSet does not a particular order
        // 2. Items in ArrayList are repeatable while it is not repeatable in HashSet

        //todo: practice
        // 生成50个 0-9999之间的随机数，要求不能有重复的
        HashSet<Integer> hs = new HashSet<>();
        List<Integer> intList = new ArrayList<>();
        while(intList.size() != 50){
            int newInt = (int)(Math.random() * 10000);
            if (!hs.contains(newInt)){
                hs.add(newInt);
                intList.add(newInt);
            }
        }
        System.out.println(intList);

        //-----------------LinkedList----------------------
        //todo: difference with LinkedList
        // 1. insert() speed in ArrayList is much lower than LinkedList
        // 2. the speed in finding an item in ArrayList is much faster than LinkedList

        //todo: practice
        // 比较 ArrayList和LinkedList 在最后面插入100000条数据
        Date now = new Date();
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 100000; i++){
            ints.add((int)(Math.random() * 100000));
        }
        System.out.println("ArrayList adding speed: " + (new Date().getTime() - now.getTime()));

        now = new Date();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 100000; i++){
            ll.addLast((int)(Math.random() * 100000));
        }
        System.out.println("LinkedList adding speed: " + (new Date().getTime() - now.getTime()));

        // 在List的中间位置，插入数据，比较ArrayList快，还是LinkedList快，并解释为什么？
        now = new Date();
        for (int i = 0; i < 100000; i++){
            ints.add(ints.size() / 2, (int)(Math.random() * 100000));
        }
        System.out.println("ArrayList adding speed: " + (new Date().getTime() - now.getTime()));

        now = new Date();
        for (int i = 0; i < 100000; i++){
            ll.add(ll.size(), (int)(Math.random() * 100000));
        }
        System.out.println("LinkedList adding speed: " + (new Date().getTime() - now.getTime()));

        //--------------------HashMap vs HashTable-----------------------
        //todo: difference between HashMap and HashTable
        // 1. HashMap can store "null" while HashTable cannot
        // 2. HashMap is not synchronizable while HashTable is

        //todo: practice

        HashMap<String, String> heroType = new HashMap<>();
        heroType.put("adc","物理英雄");
        heroType.put("apc","魔法英雄");
        heroType.put("t", "坦克");
        System.out.println(swapHashMap(heroType));
    }

    public static HashMap<String, String> swapHashMap(HashMap<String, String> hm){
        HashMap<String, String> newHm = new HashMap<>();
        for (Map.Entry<String, String> entry : hm.entrySet()){
            newHm.put(entry.getValue(), entry.getKey());
        }
        return newHm;
    }
}
