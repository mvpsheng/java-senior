package factory.factoryMethodPattern;

/**
 * FileName: remoteDesktop.Client
 * author: gxs
 * Date: 2022/3/7  16:29
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new FactoryA();
        factory.makeProduct().doSomething();

        factory = new FactoryB();
        factory.makeProduct().doSomething();
    }
}
