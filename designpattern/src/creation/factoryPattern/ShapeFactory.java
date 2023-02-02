package behavioural.singletonpattern.factoryPattern;

/**
 * FileName: ShapeFactory
 * author: gxs
 * Date: 2021/8/17  22:07
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        shapeType = shapeType.toLowerCase();
        switch (shapeType) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
