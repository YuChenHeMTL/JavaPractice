package character.character;

public class ADAPHero extends Hero implements Mortal, AD, AP{
    @Override
    public void die(){
        System.out.print("一个ADAP的英雄死了");
    }

    @Override
    public void physicalAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void revive(){
        System.out.println("一个ADAP英雄复活了");
    }
}
