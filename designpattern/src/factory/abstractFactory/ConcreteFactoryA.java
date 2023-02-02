package factory.abstractFactory;

/**
 * FileName: ConcreteFactoryA
 * author: gxs
 * Date: 2022/3/7  16:42
 */
public class ConcreteFactoryA implements IFactory{
    @Override
    public IProductA makeProductA() {
        return new ConcreteProductAWithFamilyA();
    }

    @Override
    public IProductB makeProductB() {
        return new ConcreteProductBWithFamilyA();
    }
}
