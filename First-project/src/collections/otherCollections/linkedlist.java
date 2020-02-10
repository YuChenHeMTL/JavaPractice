package collections.otherCollections;

import character.character.Hero;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {

        //LinkedList是一个双向链表结构的list
        LinkedList<Hero> ll =new LinkedList<Hero>();

        //所以可以很方便的在头部和尾部插入数据

        //todo: addLast = add to the end of queue
        //在最后插入新的英雄
        ll.addLast(new Hero("hero1"));
        ll.addLast(new Hero("hero2"));
        ll.addLast(new Hero("hero3"));
        System.out.println(ll);

        //todo: addFirst = add to the front of queue
        //在最前面插入新的英雄
        ll.addFirst(new Hero("heroX"));
        System.out.println(ll);

        //todo: getFirst = return first element of queue
        //查看最前面的英雄
        System.out.println(ll.getFirst());
        //todo: getLast = return last element of queue
        //查看最后面的英雄
        System.out.println(ll.getLast());

        //查看不会导致英雄被删除
        System.out.println(ll);
        //todo: removeFirst = remove first element of queue
        //取出最前面的英雄
        System.out.println(ll.removeFirst());
        //todo: removeLast = remove last element of queue
        //取出最后面的英雄
        System.out.println(ll.removeLast());

        //取出会导致英雄被删除
        System.out.println(ll);

    }
}
