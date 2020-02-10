package collections.otherCollections;

import character.character.Hero;

import java.util.LinkedList;

public class MyStack extends LinkedList implements Stack  {
    @Override
    public void push(Hero h){
        super.addLast(h);
    }

    @Override
    //把最后一个英雄取出来
    public Hero pull(){
        return (Hero) super.removeLast();
    }
    //查看最后一个英雄
    @Override
    public Hero peek(){
        return (Hero) super.getLast();
    }

    public static void main(String[] args) {
        MyStack s = new MyStack();
        for (int i = 0; i < 5; i++){
            s.push(new Hero("hero" + i));
        }
        System.out.println(s.size());
        for (int i = 0; i < 5; i++){
            System.out.println(s.pull().name);
        }
    }
}
