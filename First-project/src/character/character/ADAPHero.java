package character.character;

public class ADAPHero extends Hero implements Mortal{
    @Override
    public void die(){
        System.out.print("一个ADAP的英雄死了");
    }
}
