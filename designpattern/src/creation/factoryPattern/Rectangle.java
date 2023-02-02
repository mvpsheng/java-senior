package behavioural.singletonpattern.factoryPattern;

/**
 * FileName: Rectangle
 * author: gxs
 * Date: 2021/8/17  22:05
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
