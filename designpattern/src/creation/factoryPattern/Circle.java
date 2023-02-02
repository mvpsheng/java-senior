package behavioural.singletonpattern.factoryPattern;

/**
 * FileName: Circle
 * author: gxs
 * Date: 2021/8/17  22:06
 */
public class Circle implements Shape{
        @Override
        public void draw() {
            System.out.println("Inside Circle::draw() method.");
        }
}
