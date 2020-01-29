package character.practice;

public class Fish extends Animal implements Pet {
    private String name;

    public Fish(){
        super(0);
        this.name = "";
    }

    public void walk(){
        System.out.println("鱼因为没有腿所以不能走");
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void play(){
        System.out.println("鱼在玩");
    }

    public void eat(){
        System.out.println("鱼在吃");
    }
}
