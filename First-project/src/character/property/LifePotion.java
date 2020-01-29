package character.property;

public class LifePotion extends Item {
    //todo: method overriding
    //Overrides method effect() in Item
    public void effect(){
        System.out.println("血瓶使用后，可以回血");
    }

}
