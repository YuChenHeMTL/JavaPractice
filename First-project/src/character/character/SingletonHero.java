package character.character;

public class SingletonHero {
    private SingletonHero(){}

    private static SingletonHero instance = new SingletonHero();

    public static SingletonHero getInstance(){
        return instance;
    }
}
