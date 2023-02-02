package structural.DecoratorPattern;

/**
 * FileName: Circle
 * author: gxs
 * Date: 2021/8/18  13:39
 */
public class Circle implements ShapeDec{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
