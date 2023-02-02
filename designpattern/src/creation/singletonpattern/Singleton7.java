package behavioural.singletonpattern;

/**
 * FileName: Singleton7
 * author: gxs
 * Date: 2021/8/17  21:53
 */
public class Singleton7 {
    private static volatile Singleton7 instance = null;
    private Singleton7() {}
    public static Singleton7 getInstance(){
        if (instance == null){
            synchronized (Singleton7.class){
                if (instance == null){
                    instance = new Singleton7();
                }
            }
        }
        return instance;
    }
}
