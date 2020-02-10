package collections.otherCollections.BinaryTree;

import character.character.Hero;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HeroNode {
    public Hero value;
    public HeroNode rightNode;
    public HeroNode leftNode;

    public void add(Hero v) {
        // 如果当前节点没有值，就把数据放在当前节点上
        if (null == value)
            value = v;

            // 如果当前节点有值，就进行判断，新增的值与当前值的大小关系
        else {
            // 新增的值，比当前值小或者相同

            if (v.hp - value.hp <= 0) {
                if (null == leftNode)
                    leftNode = new HeroNode();
                leftNode.add(v);
            }
            // 新增的值，比当前值大
            else {
                if (null == rightNode)
                    rightNode = new HeroNode();
                rightNode.add(v);
            }

        }

    }
    public List<Hero> values() {
        List<Hero> values = new ArrayList<>();

        // 右节点的遍历结果
        if (null != rightNode)
            values.addAll(rightNode.values());

        // 当前节点
        values.add(value);

        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.values());
        return values;
    }

    public static void main(String[] args) {
        HeroNode hn = new HeroNode();
        for (int i = 0; i < 10; i++){
            hn.add(new Hero("hero" + i, (float)(Math.random() * 100)));
        }
        List<Hero> heros = hn.values();
        for (int i = 0; i < heros.size(); i++){
            System.out.println("name: " + heros.get(i).name + " hp: " + heros.get(i).hp);
        }

        //todo: practice 2
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 40000; i++){
            ints.add((int)(Math.random() * 100000));
        }
        Date now = new Date();
        List<Integer> newInts = new ArrayList<>();
        newInts.addAll(ints);
        List<Integer> result = bubbleSort(newInts);
        System.out.println("bubble sort took " + (new Date().getTime() - now.getTime()) + " ms");

        now = new Date();
        newInts = new ArrayList<>();
        newInts.addAll(ints);
        result = fazhengSort(newInts);
        System.out.println("fazheng sort took " + (new Date().getTime() - now.getTime()) + " ms");

        now = new Date();
        newInts = new ArrayList<>();
        newInts.addAll(ints);
        BinaryTree bt = new BinaryTree();
        for (int i = 0; i < newInts.size(); i++){
            bt.add(newInts.get(i));
        }
        List<Object> results = bt.values();
        System.out.println("binary sort took " + (new Date().getTime() - now.getTime()) + " ms");

        //todo: results
        // bubble sort took 20227 ms
        // fazheng sort took 18311 ms
        // binary sort took 49 ms
    }

    public static List<Integer> bubbleSort(List<Integer> ints){
        //冒泡倒排序
        for (int i = 0; i < ints.size(); i++){
            for (int j = 0; j < ints.size() - i - 1; j++){
                if (ints.get(j) < ints.get(j+1)){
                    int temp = ints.get(j);
                    ints.set(j, ints.get(j+1));
                    ints.set(j+1, temp);
                }
            }
        }
        return ints;
    }

    public static List<Integer> fazhengSort(List<Integer> ints){
        for (int i = 0; i < ints.size() - 1; i++){
            for (int j = i + 1; j < ints.size(); j++){
                if (ints.get(j) < ints.get(i)){
                    int temp = ints.get(i);
                    ints.set(i, ints.get(j));
                    ints.set(j, temp);
                }
            }
        }
        return ints;
    }
}
