package character.character1;

import character.character.Healer;
import character.character.Hero;

public class SupportHero extends Hero implements Healer {
    @Override
    public void heal(){
        System.out.println(this.name + " 使用了治疗");
    }

    void heal(Hero h){
        h.hp += 100;
        System.out.println(name + " 使 " + h.name + "恢复了 100 hp");
    }

    void heal(Hero h, int hp){
        h.hp += hp;
        System.out.println(name + " 使 " + h.name + "恢复了 " + hp + " hp");
    }

    public static void main(String[] args) {
        SupportHero healer = new SupportHero();
        healer.name = "索拉卡";

        Hero h1 = new Hero();
        h1.name = "盖伦";

        healer.heal();
        healer.heal(h1);
        healer.heal(h1, 200);
    }
}
