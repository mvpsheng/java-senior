package factory.factoryMethodPattern;

/**
 * FileName: FactoryA
 * author: gxs
 * Date: 2022/3/7  16:30
 */
public class FactoryA implements IFactory{
    @Override
    public IProduct makeProduct() {
        return new ProductA();
    }
}
