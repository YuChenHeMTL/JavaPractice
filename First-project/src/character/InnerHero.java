package character;

//todo: 内部类 - Inner Class
public abstract class InnerHero {
    String name; // 姓名
    float hp; // 血量
    float armor; // 护甲
    int moveSpeed; // 移动速度

    class BattleScore {
        int kill;
        int die;
        int assit;

        //todo: 非静态内部类 - non-static inner class
        // 非静态内部类，只有一个外部类对象存在的时候，才有意义
        // 战斗成绩只有在一个英雄对象存在的时候才有意义
        // non-static inner classes only have meaning when defined with its other class
        // eg. a BattleScore only makes sense when it's defined with a Hero
        // initialization : new 外部类().new 内部类()

        public void legendary() {
            if (kill >= 8)
                System.out.println(name + "超神！");
            else
                System.out.println(name + "尚未超神！");
        }
    }

    //todo: 静态内部类 - static inner class
    // 语法：new 外部类.静态内部类();

    static class EnemyCrystal{
        int hp=5000;

        //如果水晶的血量为0，则宣布胜利
        public void checkIfVictory(){
            if(hp==0){
                //静态内部类不能直接访问外部类的对象属性
//                System.out.println(name + " win this game");
            }
        }
    }

    public abstract void attack();


    public static void main(String[] args) {
//        InnerHero garen = new InnerHero();
//        garen.name = "盖伦";

        //todo: 实例化内部类
        // BattleScore对象只有在一个英雄对象存在的时候才有意义
        // 所以其实例化必须建立在一个外部类对象的基础之上

//        BattleScore score = garen.new BattleScore();
//        score.kill = 9;
//        score.legendary();

        //实例化静态内部类
        InnerHero.EnemyCrystal crystal = new InnerHero.EnemyCrystal();
        crystal.checkIfVictory();

        //todo: 匿名类 - anonymous inner class
        // 有的时候，为了快速使用，直接实例化一个抽象类，并“当场”实现其抽象方法。
        // 既然实现了抽象方法，那么就是一个新的类，只是这个类，没有命名。
        // 这样的类，叫做匿名类
        // The anonymous inner class is used to instantiate an abstract class
        // Since it is not abstract, it is a new class inheriting from its abstract parent class
        // Here, it has made the method "attack()" real in the instantiation
        InnerHero h = new InnerHero(){
            //当场实现attack方法
            public void attack() {
                System.out.println("新的进攻手段");
            }
        };

        //todo: 本地类 - local inner class
        // --> 有名字的匿名类
        // 内部类与匿名类不一样的是，内部类必须声明在成员的位置，即与属性和方法平等的位置。
        // 本地类和匿名类一样，直接声明在代码块里面，可以是主方法，for循环里等等地方

        //todo: difference between inner class, anonymous inner class and local inner class:
        // inner class must be defined in the same space as properties
        // local and anonymous inner classes are defined inside the code blocks (main(), for loops, etc)
        class SomeHero extends InnerHero {
            public void attack() {
                System.out.println( name+ " 新的进攻手段");
            }
        }

        //在匿名类中使用外部的局部变量，外部的局部变量必须修饰为final
        final int damage = 5;

        InnerHero h1 = new InnerHero(){
            public void attack() {
                System.out.printf("新的进攻手段，造成%d点伤害",damage );
            }
        };

        // ---------------- same as -----------------------------------------

        //这里使用本地类AnonymousHero来模拟匿名类的隐藏属性机制

        //事实上的匿名类，会在匿名类里声明一个damage属性，并且使用构造方法初始化该属性的值
        //在attack中使用的damage，真正使用的是这个内部damage，而非外部damage

        //假设外部属性不需要声明为final
        //那么在attack中修改damage的值，就会被暗示为修改了外部变量damage的值

        //但是他们俩是不同的变量，是不可能修改外部变量damage的
        //所以为了避免产生误导，外部的damage必须声明为final,"看上去"就不能修改了
        class AnonymousHero extends InnerHero{
            int damage;
            public AnonymousHero(int damage){
                this.damage = damage;
            }
            public void attack() {
                damage = 10;
                System.out.printf("新的进攻手段，造成%d点伤害",this.damage );
            }
        }
    }

}
