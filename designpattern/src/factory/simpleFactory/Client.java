package factory.simpleFactory;

/**
 * FileName: Client
 * author: gxs
 * Date: 2023/2/2  9:31
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.getProduct(1).sell();
        factory.getProduct(2).sell();
    }
}
