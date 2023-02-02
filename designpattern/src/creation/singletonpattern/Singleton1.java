package behavioural.singletonpattern;

/**
 * FileName: Singleton1
 * author: gxs
 * Date: 2021/9/1  22:08
 */
//饿汉式单例类,初始化时,已经自行实例化
public class Singleton1 {
    private Singleton1(){}
    private static final Singleton1 single = new Singleton1();
    //静态工厂方法

    public static Singleton1 getSingle() {
        return single;
    }
}
/**
 * 在类创建的同时已经创建好了一个静态对象供系统使用,
 * 以后不再改变,所以天生线程安全
 * */
