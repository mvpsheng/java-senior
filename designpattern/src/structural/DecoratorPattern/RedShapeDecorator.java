package structural.DecoratorPattern;

/**
 * FileName: RedShapeDecorator
 * author: gxs
 * Date: 2021/8/18  13:41
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(ShapeDec decoratorShape){
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }
    private void setRedBorder(ShapeDec decoratorShape){
        System.out.println("Border Color: Red");
    }
}
