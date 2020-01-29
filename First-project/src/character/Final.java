package character;

//todo: final

//if a class has "final" modifier, it cannot be inherited
public final class Final {

    //常量: 可以公开，直接访问，不会变化的值
    //constant variable
    public static final int finalNumber = 6;

    //if a method has "final" modifier, it cannot be overriden by child classes
    public final void write(){
        System.out.println("something");
    }

    public static void main(String[] args) {
        final int i;
        i = 1;
        //a variable denoted "final" can only be assigned once


    }
}
