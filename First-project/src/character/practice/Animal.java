package character.practice;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs = legs;
    }

    public abstract void eat();

    public void walk(){
        System.out.println("这个动物用"+ this.legs + "走路");
    }
}
