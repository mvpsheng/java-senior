package behavioural.singletonpattern;

/**
 * FileName: SingletonLazyBoy
 * author: gxs
 * Date: 2021/9/1  21:53
 */
//懒汉式单例类，在第一次调用时候实例化自己
public class SingletonLazyBoy {

    private SingletonLazyBoy(){}
    private static SingletonLazyBoy singletonLazyBoy = null;
    //静态工厂方法

    public static SingletonLazyBoy getInstance() {
        if(singletonLazyBoy == null){
            singletonLazyBoy = new SingletonLazyBoy();
        }
        return singletonLazyBoy;
    }
}
/**
 * 比上面的要好,即实现了线程安全,又避免了同步带来的性能应影响.
 * */
class Singleton{
    private static class LazyHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton(){}
    public static Singleton getInstance(){
        return LazyHolder.INSTANCE;
    }
}