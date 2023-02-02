package factory.abstractFactory;

/**
 * FileName: ConcreteProductAWithFamilyA
 * author: gxs
 * Date: 2022/3/7  16:43
 */
public class ConcreteProductBWithFamilyA implements IProductB{
    @Override
    public void doB() {
        System.out.println("the productB be part of FamilyA");
    }
}
