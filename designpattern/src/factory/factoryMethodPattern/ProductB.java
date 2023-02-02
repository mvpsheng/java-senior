package factory.factoryMethodPattern;

/**
 * FileName: ProductA
 * author: gxs
 * Date: 2022/3/7  16:31
 */
public class ProductB implements IProduct{
    @Override
    public void doSomething() {
        System.out.println("I am ProductB");
    }
}
