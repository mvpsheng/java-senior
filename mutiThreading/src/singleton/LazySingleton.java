package singleton;

/**
 * FileName: LazySingleton
 * author: gxs
 * Date: 2021/9/2  10:00
 */
/**
 *
 *
 * 懒汉单例模式，一种支持延迟加载的策略，只会在instance第一次使用时创建对象
 * */
public class LazySingleton {
    private LazySingleton(){
        System.out.println("LazySingleton is create");
    }

    private static LazySingleton instance = null;
    public static synchronized LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
