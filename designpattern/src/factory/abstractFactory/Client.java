package factory.abstractFactory;

/**
 * FileName: remoteDesktop.Client
 * author: gxs
 * Date: 2022/3/7  16:39
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new ConcreteFactoryA();
        factory.makeProductA().doA();
        factory.makeProductB().doB();

        factory = new ConcreteFactoryB();
        factory.makeProductA().doA();
        factory.makeProductB().doB();
    }
}
