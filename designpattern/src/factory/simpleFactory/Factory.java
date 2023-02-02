package factory.simpleFactory;

/**
 * FileName: Factory
 * author: gxs
 * Date: 2023/2/2  9:30
 */
public class Factory {
    public Product getProduct(int i) {
        Product pro;
        if (i == 1) {
            pro = new ConcreteProductA();
        } else {
            pro = new ConcreteProductB();
        }
        return pro;
    }
}
