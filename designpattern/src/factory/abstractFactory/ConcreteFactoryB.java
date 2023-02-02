package factory.abstractFactory;

/**
 * FileName: ConcreteFactoryA
 * author: gxs
 * Date: 2022/3/7  16:42
 */
public class ConcreteFactoryB implements IFactory{
    @Override
    public IProductA makeProductA() {
        return new ConcreteProductAWithFamilyB();
    }

    @Override
    public IProductB makeProductB() {
        return new ConcreteProductBWithFamilyB();
    }
}
