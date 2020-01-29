package character.practice;

public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name){
        super(4);
        this.name = name;
    }

    public Cat(){
        super(4);
        this.name = "";
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void play(){
        System.out.println("这只猫在玩");
    }

    public void eat(){
        System.out.println("猫在吃");
    }
}
