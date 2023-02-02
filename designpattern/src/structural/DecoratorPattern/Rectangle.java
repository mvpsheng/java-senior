package structural.DecoratorPattern;

/**
 * FileName: Rectangle
 * author: gxs
 * Date: 2021/8/18  13:38
 */
public class Rectangle implements ShapeDec{
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
