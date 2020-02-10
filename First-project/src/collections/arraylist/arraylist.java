package collections.arraylist;

import array.Array;
import character.character.Hero;

import java.util.ArrayList;

public class arraylist {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        //容器类ArrayList，用于存放对象
        ArrayList heros = new ArrayList();
        heros.add( new Hero("盖伦"));
        System.out.println(heros.size());

        //容器的容量"capacity"会随着对象的增加，自动增长
        //只需要不断往容器里增加英雄即可，不用担心会出现数组的边界问题。
        heros.add( new Hero("提莫"));
        System.out.println(heros.size());

        //todo: add
        // 把5个对象加入到ArrayList中
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        System.out.println(heros);

        // 在指定位置增加对象
        Hero specialHero = new Hero("special hero");
        heros.add(3, specialHero);

        //todo: contains
        System.out.println(heros);
        // 判断一个对象是否在容器中
        // 判断标准： 是否是同一个对象，而不是name是否相同
        System.out.print("虽然一个新的对象名字也叫 hero 1，但是contains的返回是:");
        System.out.println(heros.contains(new Hero("hero 1")));
        System.out.print("而对specialHero的判断，contains的返回是:");
        System.out.println(heros.contains(specialHero));

        //todo: get
        //获取指定位置的对象
        System.out.println(heros.get(5));
        //如果超出了范围，依然会报错
        System.out.println(heros.get(6));

        //todo: indexOf
        System.out.println(heros);
        System.out.println("specialHero所处的位置:"+heros.indexOf(specialHero));
        System.out.println("新的英雄，但是名字是\"hero 1\"所处的位置:"+heros.indexOf(new Hero("hero 1")));

        //todo: remove
        // can remove by index: remove(2)
        // also can remove by item: remove(specialHero)
        heros.remove(2);
        System.out.println("删除下标是2的对象");
        System.out.println(heros);
        System.out.println("删除special hero");
        heros.remove(specialHero);
        System.out.println(heros);

        //todo: set
        // can replace the item at the indicated index in the arrayList
        System.out.println("把下标是5的元素，替换为\"hero 5\"");
        heros.set(5, new Hero("hero 5"));
        System.out.println(heros);

        //todo: size
        // returns size of arrayList
        System.out.println("获取ArrayList的大小：");
        System.out.println(heros.size());

        //todo: toArray
        // !! needs to indicate the returned array type
        Hero hs[] = (Hero[])heros.toArray(new Hero[]{});
        System.out.println("数组:" +hs);

        //todo: addAll
        // add all items in another arrayList to the current one
        ArrayList anotherHeros = new ArrayList();
        anotherHeros.add(new Hero("hero a"));
        anotherHeros.add(new Hero("hero b"));
        anotherHeros.add(new Hero("hero c"));
        System.out.println("anotherHeros heros:\t" + anotherHeros);
        heros.addAll(anotherHeros);
        System.out.println("把另一个ArrayList的元素都加入到当前ArrayList:");
        System.out.println("ArrayList heros:\t" + heros);

        //todo: clear
        // empties the current arrayList
        System.out.println("ArrayList heros:\t" + heros);
        System.out.println("使用clear清空");
        heros.clear();
        System.out.println("ArrayList heros:\t" + heros);

        //todo: practice
        heros.clear();
        heros.add(new Hero("hero 1"));
        heros.add(new Hero("hero 2"));
        containsName(heros, "hero 1");
    }

    public static void containsName(ArrayList<Hero> heros, String name){
        for (int i = 0; i < heros.size(); i++){
            if (heros.get(i).name.equals(name)){
                System.out.println("Found hero named " + name + "at index " + i);
            }
        }
    }
}
