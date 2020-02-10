package collections.arraylist;

import character.character.APHero;
import character.character.Hero;
import character.property.Item;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        //ArrayList实现了接口List

        //常见的写法会把引用声明为接口List类型
        //注意：是java.util.List,而不是java.awt.List
        //接口引用指向子类对象（多态）

        //todo: List is the interface that ArrayList has formalized
        // so all properties of ArrayList are contained in List

        List<Hero> heros = new ArrayList();
        heros.add( new Hero("盖伦"));
        System.out.println(heros.size());

        //对于不使用泛型的容器，可以往里面放英雄，也可以往里面放物品
        List heros1 = new ArrayList();

        heros1.add(new Hero("盖伦"));

        //本来用于存放英雄的容器，现在也可以存放物品了
        heros1.add(new Item("冰杖"));

        //对象转型会出现问题
        Hero h1=  (Hero) heros1.get(0);
        //尤其是在容器里放的对象太多的时候，就记不清楚哪个位置放的是哪种类型的对象了
//        Hero h2=  (Hero) heros1.get(1);

        //引入泛型Generic
        //声明容器的时候，就指定了这种容器，只能放Hero，放其他的就会出错
        List<Hero> genericHeros = new ArrayList<Hero>();
        genericHeros.add(new Hero("盖伦"));
        //如果不是Hero类型，根本就放不进去
        //genericHeros.add(new Item("冰杖"));

        //除此之外，还能存放Hero的子类
        genericHeros.add(new APHero());

        //并且在取出数据的时候，不需要再进行转型了，因为里面肯定是放的Hero或者其子类
        Hero h = genericHeros.get(0);

        //todo: practice
        HeroItemArrayList newArrayList = new HeroItemArrayList();
        newArrayList.add(new Hero("盖伦"));
        newArrayList.add(new Item("黑切"));
        newArrayList.add("wow");
        System.out.println(newArrayList);
    }

    static class HeroItemArrayList<T> extends ArrayList {
        @Override
        public boolean add(Object e) {
            // TODO Auto-generated method stub
            if (e instanceof Item || e instanceof Hero) {
                System.out.println("adding success");
                return super.add(e);
            }else {
                System.out.println("adding fail");
                return false;
            }
        }
    }
}
