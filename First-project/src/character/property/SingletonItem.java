package character.property;

public class SingletonItem {
    private SingletonItem(){}

    private static SingletonItem instance = null;

    public static SingletonItem getInstance(){
        if (null == instance){
            instance = new SingletonItem();
        }
        return instance;
    }
}
