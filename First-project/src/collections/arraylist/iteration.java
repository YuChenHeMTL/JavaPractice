package collections.arraylist;

import character.character.Hero;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteration {
    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<Hero>();
        // 放5个Hero进入容器
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero name " + i));
        }

        //todo: normal for loop
        // 第一种遍历 for循环
        System.out.println("--------for 循环-------");
        for (int i = 0; i < heros.size(); i++) {
            Hero h = heros.get(i);
            System.out.println(h);
        }

        //todo: iterator
        // 第二种遍历，使用迭代器
        System.out.println("--------使用while的iterator-------");
        Iterator<Hero> it= heros.iterator();
        //从最开始的位置判断"下一个"位置是否有数据
        //如果有就通过next取出来，并且把指针向下移动
        //直到"下一个"位置没有数据
        while(it.hasNext()){
            Hero h = it.next();
            System.out.println(h);
        }

        //todo: iterator in for loop
        //迭代器的for写法
        System.out.println("--------使用for的iterator-------");
        for (Iterator<Hero> iterator = heros.iterator(); iterator.hasNext();) {
            Hero hero = (Hero) iterator.next();
            System.out.println(hero);
        }

        //todo: enhanced for loop
        // 第三种，增强型for循环
        System.out.println("--------增强型for循环-------");
        for (Hero h : heros) {
            System.out.println(h);
        }

        //todo: practice
        System.out.println("--------practice---------");
        heros = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            heros.add(new Hero("hero"+i));
        }

        List<Hero> newHeros = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            newHeros.add(heros.get(i));
        }

        System.out.println("----------normal for loop----------");
        for (int i = 0; i < newHeros.size(); i++){
            if (Integer.parseInt(newHeros.get(i).name.substring(4)) % 8 == 0) {
                System.out.println("removed Hero name: " + newHeros.get(i).name);
                newHeros.remove(i);
            }
        }

        newHeros.clear();
        for(int i = 0; i < 100; i++){
            newHeros.add(heros.get(i));
        }
        System.out.println("----------iterator----------");
        Iterator<Hero> hite = newHeros.iterator();
        while(hite.hasNext()){
            Hero hero = hite.next();
            if (Integer.parseInt(hero.name.substring(4)) % 8 == 0) {
                hite.remove();
                System.out.println("removed Hero name: " + hero.name);
            }
        }
        System.out.println(newHeros.size());

        newHeros.clear();
        for(int i = 0; i < 100; i++){
            newHeros.add(heros.get(i));
        }
        System.out.println("----------iterator for loop----------");
        for (Iterator<Hero> ite = newHeros.iterator(); ite.hasNext();){
            Hero hero = ite.next();
            if (Integer.parseInt(hero.name.substring(4)) % 8 == 0) {
                ite.remove();
                System.out.println("removed Hero name: " + hero.name);
            }
        }
        System.out.println(newHeros.size());

        newHeros.clear();
        for(int i = 0; i < 100; i++){
            newHeros.add(heros.get(i));
        }
        System.out.println("----------enhanced for loop----------");
        for (Hero hero : newHeros){
            if (Integer.parseInt(hero.name.substring(4)) % 8 == 0) {
                ;
                System.out.println("removed Hero name: " + hero.name);
            }
        }
        System.out.println(newHeros.size());
    }
}
