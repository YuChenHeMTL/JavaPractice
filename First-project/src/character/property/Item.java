package character.property;

public class Item {
    public String name;
    public int price;

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public Item(){
        this.name = null;
    }

    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }

    //todo: Object practice
    public String toString() {
        return "Item [name= " + name + ", price = " + price + "]\r\n";
    }

    public void finalize(){
        System.out.println("当前对象正在被回收");
    }

    public boolean equals(Object o){
        //equals(Object o) 首先判断o是否是Item类型，然后比较两个Item的price是否相同
        if (o instanceof Item ){
            Item temp = (Item) o;
            return this.price == temp.price;
        }
        return false;
    }



    public static void main(String[] args) {
        Item i = new Item();
        i.effect();

        //todo: 类的多态现象 - polymorphism
        //都是同一个类型，调用同一个方法，却能呈现不同的状态
        // inherits from the same class, uses the same method, but different outputs

        LifePotion lp =new LifePotion();
        lp.effect();

        MagicPotion mp = new MagicPotion();
        mp.effect();
    }
}
