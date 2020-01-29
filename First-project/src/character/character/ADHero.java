package character.character;

public class ADHero extends Hero implements AD, Mortal {
    public void attack() {
        System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
    }

    public void attack(Hero h1) {
        System.out.println(name + "对" + h1.name + "进行了一次攻击 ");
    }

    public void attack(Hero h1, Hero h2) {
        System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
    }

    // 可变数量的参数
    public void attack(Hero... heros) {
        System.out.print(name + " 同时对 ");
        for (int i = 0; i < heros.length - 1; i++) {
            System.out.print(heros[i].name + " , ");
        }
        System.out.print("和 " + heros[heros.length - 1].name + " 进行了攻击 ");
    }

    @Override
    public void physicalAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void die(){
        System.out.print("一个AD的英雄死了");
    }

    //隐藏父类的battleWin方法
    public static void battleWin(){
        System.out.println("ad hero battle win");
    }

    //todo: super: 子类显式调用父类带参构造

    public ADHero(){
        //the parent constructor is used here
        super();
    }

    public static void main(String[] args) {
        ADHero bh = new ADHero();
        bh.name = "赏金猎人";

        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";
        Hero h3 = new Hero();
        h3.name = "盲僧";
        Hero h4 = new Hero();
        h4.name = "诺手";

        bh.attack(h1);
        bh.attack(h1, h2, h3, h4);
    }

}