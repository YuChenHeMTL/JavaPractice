package character.property;

public class Armor extends Item {
    int ac; //护甲等级

    public static void main(String[] args) {
        Armor cloth = new Armor();
        cloth.price = 300;
        cloth.ac = 15;

        Armor chainmail = new Armor();
        chainmail.price = 500;
        chainmail.ac = 40;
    }
}
