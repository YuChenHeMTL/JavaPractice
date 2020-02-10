package collections.otherCollections;

import character.character.Hero;
import javafx.util.Pair;

import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Hero> heroMap = new HashMap<String,Hero>();

        heroMap.put("gareen", new Hero("gareen1"));
        System.out.println(heroMap);

        //key为gareen已经有value了，再以gareen作为key放入数据，会导致原英雄，被覆盖
        //不会增加新的元素到Map中
        heroMap.put("gareen", new Hero("gareen2"));
        System.out.println(heroMap);

        //清空map
        heroMap.clear();
        Hero gareen = new Hero("gareen");

        //同一个对象可以作为值插入到map中，只要对应的key不一样
        heroMap.put("hero1", gareen);
        heroMap.put("hero2", gareen);

        System.out.println(heroMap);

        //todo: practice
        List<Hero> heros = new ArrayList<>();
        for (int i = 0; i < 3000000; i++){
            heros.add(new Hero("hero-" + (int)(Math.random() * 10000)));
        }
        int numOfHero5555 = 0;
        Date now = new Date();
        for (Hero value : heros) {
            if (value.name.equals("hero-5555")) numOfHero5555++;
        }
        System.out.println("Using for loop, found "+ numOfHero5555 + " hero-5555 heros in " + (new Date().getTime() - now.getTime()));

        numOfHero5555 = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        for (Hero hero : heros) {
            if (!hm.containsKey(hero.name)) {
                hm.put(hero.name, 1);
            } else {
                hm.put(hero.name, hm.get(hero.name) + 1);
            }
        }
        now = new Date();
        numOfHero5555 = hm.get("hero-5555");
        System.out.println("Using hashmap, found "+ numOfHero5555 + " hero-5555 heros in " + (new Date().getTime() - now.getTime()));
    }
}
