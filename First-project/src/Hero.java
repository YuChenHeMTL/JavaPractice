public class Hero {
    String name;

    float hp;

    float armor;

    int moveSpeed;

    float getArmor(){
        return armor;
    }

    //坑队友
    void keng(){
        System.out.println("坑队友！");
    }

    //增加移动速度
    void addSpeed(int speed){
        //在原来的基础上增加移动速度
        moveSpeed = moveSpeed + speed;
    }

    void legendary(){
        System.out.println(name + " is legendary!");
    }

    float getHp(){
        return hp;
    }

    void recovery(float blood){
        hp += blood;
    }

    public static void main(String[] args) {
        Hero garen =  new Hero();
        garen.name = "盖伦";
        garen.moveSpeed = 350;
        garen.addSpeed(100);

        Hero teemo =  new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
    }
}
