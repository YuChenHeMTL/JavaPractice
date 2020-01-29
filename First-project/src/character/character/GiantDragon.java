package character.character;

public class GiantDragon {
    //todo:单例模式 - Singleton
    //Singleton模式，指的是一个类，在一个JVM里，只有一个实例存在
    //Intend:Ensure a class only has one instance, and provide a global point of access to it

    //todo: 饿汉式单例模式 - Eager initialization
    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private GiantDragon(){

    }

    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个

    private static GiantDragon instance = new GiantDragon();

    //public static 方法，提供给调用者获取12行定义的对象
    public static GiantDragon getInstance(){
        return instance;
    }

    //todo: 懒汉式单例模式 - Lazy initialization

    // public static 方法，返回实例对象
    //    public static GiantDragon getInstance(){
    //    	//第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
    //    	if(null==instance){
    //    		instance = new GiantDragon();
    //    	}
    //    	//返回 instance指向的对象
    //        return instance;
    //    }

    //todo: interview question - 什么是单列模式？ what is singleton mode?
    //1. 构造方法私有化
    //2. 静态属性指向实例
    //3. public static的 getInstance方法，返回第二步的静态属性

    //1. private initialization method
    //2. static instance property
    //3. public static getInstance method, which points back to the static instance property


}
