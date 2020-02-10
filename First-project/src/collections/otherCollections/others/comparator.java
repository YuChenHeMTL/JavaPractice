package collections.otherCollections.others;

import character.character.Hero;
import character.property.Item;

import java.util.*;

public class comparator {
    public static void main(String[] args) {
        Random r =new Random();
        List<Hero> heros = new ArrayList<Hero>();

        for (int i = 0; i < 10; i++) {
            //通过随机值实例化hero的hp和damage
            heros.add(new Hero("hero "+ i, r.nextInt(100), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);

        //直接调用sort会出现编译错误，因为Hero有各种属性
        //到底按照哪种属性进行比较，Collections也不知道，不确定，所以没法排
        //Collections.sort(heros);

        //引入Comparator，指定比较的算法
        Comparator<Hero> c = new Comparator<Hero>() {
            @Override
            public int compare(Hero h1, Hero h2) {
                //按照hp进行排序
                if(h1.hp>=h2.hp)
                    return 1;  //正数表示h1比h2要大
                else
                    return -1;
            }
        };
        heros.sort(c);
        System.out.println("按照血量排序后的集合：");
        System.out.println(heros);

        //todo: practice
        TreeSet<Integer> tree = new TreeSet<>((o1, o2) -> {
            if(o1<=o2){
                return 1;
            }
            return -1;
        });
        for (int i = 0; i < 100; i++){
            tree.add(r.nextInt(100));
        }
        System.out.println(tree);

        Comparator<Item> comp = (o1, o2) -> {
            if (o1.price >= o2.price){
                return -1;
            } else{
                return 1;
            }
        };
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            int random = r.nextInt(100);
            items.add(new Item("item-"+random, random));
        }
        items.sort(comp);
        System.out.println(items);
    }
}
