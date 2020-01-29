package character.character;

//todo: abstract - 抽象类
//todo: 抽象类和接口的区别
//区别1：
//子类只能继承一个抽象类，不能继承多个
//子类可以实现多个接口
//区别2：
//抽象类可以定义
//public,protected,package,private
//静态和非静态属性
//final和非final属性
//但是接口中声明的属性，只能是
//public
//静态
//final的
//即便没有显式的声明

//todo: differences between interface & abstract class
//1. child classes can only inherit from 1 abstract class, but multiple interfaces

//2. abstract classes can be defined with public, protected, package and private
//   but interface can only be defined with public, static and final

public abstract class AbstractHero {
    // 抽象方法attack
    // Hero的子类会被要求实现attack方法
    public abstract void attack();

}
