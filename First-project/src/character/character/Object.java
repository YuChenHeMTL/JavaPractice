package character.character;

public class Object extends java.lang.Object {
    int value;

    //todo: Object类

    public void finalize(){
        //当一个对象没有任何引用指向的时候，它就满足垃圾回收的条件
        //当它被垃圾回收的时候，它的finalize() 方法就会被调用
        //finalize() 不是开发人员主动调用的方法，而是由虚拟机JVM调用的

        System.out.println("这个Object正在被回收");
    }

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o);
        System.out.println(o.toString());


    }
}
