package character.character;

public class APHero extends Hero implements AP, Mortal{
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void die(){
        System.out.print("一个AP的英雄死了");
    }

}
