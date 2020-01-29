package character.character;

public interface AP {
    public void magicAttack();

    default public void revive(){
        System.out.println("一个AP英雄复活了");
    }
}
