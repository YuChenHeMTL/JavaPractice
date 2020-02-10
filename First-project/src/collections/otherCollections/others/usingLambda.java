package collections.otherCollections.others;

import character.character.Hero;

import java.util.*;

public class usingLambda {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 10; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }

        System.out.println("初始化集合后的数据 (最后一个数据重复)：");
        System.out.println(heros);

        //传统方式
        heros.sort(new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return (int) (o2.hp - o1.hp);
            }
        });

        Hero hero = heros.get(2);
        System.out.println("通过传统方式找出来的hp第三高的英雄名称是:" + hero.name);

        //聚合方式
        String name =heros
                .stream() // stream through the arrayList of "heros"
                .sorted((h1,h2)->h1.hp>h2.hp?-1:1) // sort with comparator listed on the left (low hp to high hp)
                .skip(2)  // skip throught the first 2 elements of the sorted arrayList
                .map(h->h.getName()) // through mapping, return all hero names
                .findFirst() //find the first element of the mapped arrayList
                .get(); //return the first element of the mapped arrayList

        System.out.println("通过聚合操作找出来的hp第三高的英雄名称是:" + name);

    }
}
