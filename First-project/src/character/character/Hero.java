package character.character;

public class Hero {

    public String name; //姓名

    public float hp; //血量

    public float armor; //护甲

    public int moveSpeed; //移动速度

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

    public static void main(String[] args) {
        Hero garen =  new Hero("盖伦");
//        Hero teemo =  new Hero("提莫",383);
//        System.out.println(garen);
//        garen.showAddressInMemory();

        Hero teemo =  new Hero("提莫",383);

        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;

        teemo.revive(teemo);
        teemo.showAddressInMemory();

        System.out.println(teemo.hp);

    }

}