package character;

public class Modifiers {

    //自身：指的是Hero自己                                              (the class itself)
    //同包子类：ADHero这个类是Hero的子类，并且和Hero处于同一个包下        (in the same package, extends from parent)
    //不同包子类：Support这个类是Hero的子类，但是在另一个包下             (not in the same package, extends from parent)
    //同包类： GiantDragon 这个类和Hero是同一个包，但是彼此没有继承关系   (in the same package, not extends from parent)
    //其他类：Item这个类，在不同包，也没有继承关系的类                    (not in the same package, not extends from parent)

    //                      自身    |    同包子类   |   不同包子类   |   同胞类   |   其他类
    private int pri;   //   true    |     false    |    false       |   false    |   false
    //package           //  true    |     true     |    false       |   true     |   false
    protected String pro;// true    |     true     |    true        |   true     |   true
    public String pub;//    true    |     true     |    true        |   true     |   true

}
