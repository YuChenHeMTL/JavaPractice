package character.character;

public interface AD {
    public void physicalAttack();

    default public void revive(){
        System.out.println("一个AD英雄复活了");
    }
}
