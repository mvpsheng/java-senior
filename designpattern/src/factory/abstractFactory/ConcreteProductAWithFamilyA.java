package factory.abstractFactory;

/**
 * FileName: ConcreteProductAWithFamilyA
 * author: gxs
 * Date: 2022/3/7  16:43
 */
public class ConcreteProductAWithFamilyA implements IProductA{
    @Override
    public void doA() {
        System.out.println("the productA be part of FamilyA");
    }
}
