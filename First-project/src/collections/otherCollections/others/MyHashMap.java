package collections.otherCollections.others;

import character.character.Hero;

import java.util.*;

import static collections.otherCollections.others.hashcode.hCode;

public class MyHashMap implements IHashMap {
    public static ArrayList<LinkedList<Entry>> map = new ArrayList<>(Collections.nCopies(2000, null));

    public void put(String key,Object object){
        int index = hCode(key);
        if (map.get(index) == null){
            map.add(index, new LinkedList<>());
        }
        map.get(index).addLast(new Entry(key, object));
    }

    public Object get(String key){
        int index = hCode(key);
        if (map.get(index) != null) {
            for (Entry entry : map.get(index)) {
                if (entry.key == key) return entry.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Hero> heros = new ArrayList<>();
        for (int i = 0; i < 100000; i++){
            int random = (int) (Math.random() * 10000);
            if (random < 1000) random += 5000;
            heros.add(new Hero("hero-" + random));
            System.out.println(random);
        }

        Date now = new Date();
        int total = 0;
        for (int i = 0; i < heros.size(); i++){
            if (heros.get(i).name.equals("hero-5555")) total ++;
        }
        System.out.println("For loop searching found " + total + " hero-5555's and took " + (new Date().getTime() - now.getTime()) + " ms");

        now = new Date();
        total = 0;
        MyHashMap newMHM = new MyHashMap();
        for (int i = 0; i < heros.size(); i++){
            newMHM.put(heros.get(i).name, heros);
        }
        HashSet<Hero> hs = new HashSet<>();
        while(true){
            Hero hero = (Hero) newMHM.get("hero-5555");
            System.out.println();
            if (!hs.contains(hero)){
                hs.add(hero);
            } else {
                break;
            }
        }
        System.out.println("MyHashMap searching found " + hs.size() + " hero-5555's and took " + (new Date().getTime() - now.getTime()) + " ms");
    }
}
