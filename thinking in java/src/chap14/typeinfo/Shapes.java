package chap14.typeinfo;

import java.util.Arrays;
import java.util.List;

/**
 * FileName: Shapes
 * author: gxs
 * Date: 2021/7/27  17:05
 */
abstract class Shape{
    void draw(){
        System.out.println(this+".draw()");
    }
    abstract public String toString();
}
class Circle extends Shape{
    public String toString(){
        return "Circle";
    }
}

class Square extends Shape{
    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape{
    @Override
    public String toString() {
        return "Triangles";
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(),new Square(),new Triangle()
        );
        for (Shape shape:shapeList)
            shape.draw();
    }
}
