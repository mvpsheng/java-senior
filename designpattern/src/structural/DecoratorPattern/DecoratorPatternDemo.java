package structural.DecoratorPattern;

/**
 * FileName: DecoratorPatternDemo
 * author: gxs
 * Date: 2021/8/18  13:44
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        ShapeDec circle = new Circle();
        ShapeDec redCircle = new RedShapeDecorator(new Circle());
        ShapeDec redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
