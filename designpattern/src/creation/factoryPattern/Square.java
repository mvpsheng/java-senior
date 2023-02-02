package behavioural.singletonpattern.factoryPattern;

/**
 * FileName: Square
 * author: gxs
 * Date: 2021/8/17  22:05
 */
public class Square implements Shape{
        @Override
        public void draw() {
            System.out.println("Inside Square::draw() method.");
        }
    }
