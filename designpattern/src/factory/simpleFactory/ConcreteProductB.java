package factory.simpleFactory;

/**
 * FileName: ConcreteProductA
 * author: gxs
 * Date: 2023/2/2  9:30
 */
public class ConcreteProductB implements Product {
    @Override
    public void sell() {
        System.out.println("sell B");
    }
}
