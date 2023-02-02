package factory.factoryMethodPattern;

/**
 * FileName: FactoryA
 * author: gxs
 * Date: 2022/3/7  16:30
 */
public class FactoryB implements IFactory{
    @Override
    public IProduct makeProduct() {
        return new ProductB();
    }
}
