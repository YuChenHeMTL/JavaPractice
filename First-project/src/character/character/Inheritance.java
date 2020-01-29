package character.character;

import character.character1.SupportHero;

public class Inheritance {
    public static void main(String[] args) {
        //todo: 对象转型 - Type Casting

        Hero h =new Hero();
        ADHero ad = new ADHero();
        SupportHero s =new SupportHero();

        //todo:子类转父类(向上转型)
        //类型转换指的是把一个引用所指向的对象的类型，转换为另一个引用的类型

        //把ad引用所指向的对象的类型是ADHero
        //h引用的类型是Hero
        //把ADHero当做Hero使用，一定可以

        //since Hero is the parent class of ADHero,
        //so the conversion is allowed
        h = ad;

        //todo:父类转子类（向下转型）
        //h引用有可能指向一个ad对象，也有可能指向一个support对象
        //所以把h引用转换成AD类型的时候，就有可能成功，有可能失败
        //因此要进行强制转换，换句话说转换后果自负
        //到底能不能转换成功，要看引用h到底指向的是哪种对象
        //在这个例子里，h指向的是一个ad对象，所以转换成ADHero类型，是可以的

        //since ADHero is the child class of Hero,
        //it's going to depend on the instance of h
        //(whether it's pointing to a Hero or a ADHero instance)
        //in this case, it's pointing to a ADHero instance,
        //so the conversion is allowed
        ad = (ADHero) h;

        h = s;
        //这个时候，h指向的是一个support对象，所以转换成ADHero类型，会失败。
        //失败的表现形式是抛出异常 ClassCastException 类型转换异常

        //there is no inheritance relationship between ADHero and
        //SupportHero, so conversion is not allowed
//        ad = (ADHero)s;

        //todo:没有继承关系的两个类，互相转换
        ADHero ad1 = new ADHero();

        APHero ap = new APHero();

        // 没有继承关系的类型进行互相转换一定会失败，所以会出现编译错误
        // no inheritance relationship, so conversion not allowed
//        ad1 = (ADHero) ap;

        //todo: 实现类转换成接口(向上转型)
        //从语义上来讲，把一个ADHero当做AD来使用，而AD接口只有一个physicAttack方法，
        // 这就意味着转换后就有可能要调用physicAttack方法，
        // 而ADHero一定是有physicAttack方法的，所以转换是能成功的

        //since we're converting ADHero to AD, all methods in AD needs
        // to be defined in ADHero, which it is the case,
        // so the conversion is allowed
        AD adi = ad;

        //todo: 接口转换成实现类(向下转型)

        //adi实际上是指向一个ADHero的，所以能够转换成功
        // Here, "adi" is pointing to a ADHero,
        // so naturally type casting is allowed
        ADHero adHero = (ADHero) adi;

        //adi引用所指向的对象是一个ADHero，要转换为ADAPHero就会失败
        // no inheritance relations between ADHero and ADAPHero
//        ADAPHero adapHero = (ADAPHero) adi;
//        adapHero.magicAttack();

        //todo: instanceof
        ADHero adh = new ADHero();
        APHero ap1 = new APHero();

        Hero h1= adh;
        Hero h2= ap1;

        //判断引用h1指向的对象，是否是ADHero类型
        System.out.println(h1 instanceof ADHero);

        //判断引用h2指向的对象，是否是APHero类型
        System.out.println(h2 instanceof APHero);

        //判断引用h1指向的对象，是否是Hero的子类型
        System.out.println(h1 instanceof Hero);

    }
}
