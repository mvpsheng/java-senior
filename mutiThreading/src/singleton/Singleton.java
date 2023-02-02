package singleton;

/**
 * FileName: Singleton
 * author: gxs
 * Date: 2021/9/2  9:51
 */
/**
 * 当任何地方引用静态变量status时，都会导致类被初始化，并创建instance实例，
 * 但是类初始化只有一次，所以instance创建只有一次
 * */
public class Singleton {
    public static int STATUS = 1;
    private Singleton(){
        System.out.println("Singleton is create");
    }
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        //性能很好，因为只是简单的返回instance，没有任何锁操作，并行程序中会有良好的表现。
        return instance;
    }
}
