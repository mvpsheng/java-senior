package behavioural.singletonpattern;

/**
 * FileName: Singleton3
 * author: gxs
 * Date: 2021/8/17  21:50
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3(){}
    public static Singleton3 getInstance(){
        return instance;
    }
}
