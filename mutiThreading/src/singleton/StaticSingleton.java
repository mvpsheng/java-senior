package singleton;

/**
 * FileName: StaticSingleton
 * author: gxs
 * Date: 2021/9/2  10:05
 */
/**
 * 一种将之前两者优势结合的方法
 * 1.getInstance 没有锁，在并发环境下性能优越
 * 2.只有在被调用的时候，Singleton实例才会被创建。
 *
 * 使用内部类和类的初始化方法
 * 使用Private 内部类，不能被外部访问并初始化它
 * 只能在GetInstance()方法内部对SingletonHolder进行类初始化，利用虚拟机的类初始化机制创建单例。
 * */
public class StaticSingleton {
    private StaticSingleton(){
        System.out.println("StaticSingleton is create");
    }
    private static class SingletonHolder{
        private static StaticSingleton instance = new StaticSingleton();
    }
    public static StaticSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
