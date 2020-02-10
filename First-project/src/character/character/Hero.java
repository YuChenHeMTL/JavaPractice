package character.character;

import exceptions.EnemyHeroIsDeadException;

import java.util.Scanner;

public class Hero {

    public String name; //姓名

    public float hp; //血量

    public float armor; //护甲

    public int moveSpeed; //移动速度

    public float damage;

    public Hero(){
        this.name = "";
        this.hp = 0;
        this.armor = 0;
        this.moveSpeed = 0;
    }

    //带一个参数的构造方法
    public Hero(String heroname){
        name = heroname;
    }

    //带两个参数的构造方法
    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }

    public Hero(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }

    public void attackHero(Hero h) throws EnemyHeroIsDeadException {
        if(h.hp == 0){
            throw new EnemyHeroIsDeadException(h.name + " 已经挂了,不需要施放技能" );
        }
    }

    //todo: practice
    //带四个参数的构造方法
    public Hero(String name, float HP, float armor, int moveSpeed){
        this(name, HP);
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }

    public void showAddressInMemory(){
        System.out.println("打印this看到的虚拟地址："+this);
    }

    public void revive(Hero h){
        h = new Hero("提莫",383);
        h.showAddressInMemory();
    }

    //todo: 对象属性和类属性

    static String copyright;//类属性,静态属性

    //todo：类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("hero battle win");
    }

    //todo: 属性初始化
    //对象属性初始化
    float maxHP;

    {
        maxHP = 200; //初始化块
    }

//    public Hero(){
//        hp = 100; //构造方法中初始化
//
//    }

    //类属性初始化
    //物品栏的容量
    public static int itemCapacity=8; //声明的时候 初始化

    static{
        itemCapacity = 6;//静态初始化块 初始化
    }

    public void kill(Mortal m){
        System.out.print(this.name + "让");
        m.die();
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Hero garen =  new Hero("盖伦");
//        Hero teemo =  new Hero("提莫",383);
//        System.out.println(garen);
//        garen.showAddressInMemory();

        Hero teemo =  new Hero("提莫",383);

        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;

        teemo.revive(teemo);
//        teemo.showAddressInMemory();

//        System.out.println(teemo.hp);

        //无需对象，直接通过类调用
        Hero.battleWin();
        teemo.battleWin();

//        Scanner s = new Scanner(System.in);
//        System.out.println("请输入一个HeroType");
//        HeroType heroType = HeroType.ASSASSIN;
//        switch (heroType){
//            case TANK:
//                System.out.println("坦克"); break;
//            case WIZARD:
//                System.out.println("法师"); break;
//            case ASSASSIN:
//                System.out.println("刺客"); break;
//            case ASSIST:
//                System.out.println("辅助"); break;
//            case WARRIOR:
//                System.out.println("近战"); break;
//            case RANGED:
//                System.out.println("远程"); break;
//            case PUSH:
//                System.out.println("推进"); break;
//            case FARMING:
//                System.out.println("打野"); break;
//
//        }

        ADHero somead = new ADHero();
        APHero someap = new APHero();
        ADAPHero someadap = new ADAPHero();

        garen.kill(somead);
        garen.kill(someap);
        garen.kill(someadap);

        Hero h = new ADHero();

        //todo: 父类方法隐藏
        //这里引用的是Hero的battleWin，因为虽然他指向的是一个ADHero，
        //但它属于Hero类，所以会引用Hero类的static method
        h.battleWin();

        System.out.println(h);

    }

    public String getName() {
        return this.name;
    }
}