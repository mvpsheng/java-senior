package factory.abstractFactory;

/**
 * FileName: IFactory
 * author: gxs
 * Date: 2022/3/7  16:39
 */
public interface IFactory {
    IProductA makeProductA();
    IProductB makeProductB();
}
