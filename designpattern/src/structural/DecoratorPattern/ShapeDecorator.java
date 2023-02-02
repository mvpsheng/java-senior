package structural.DecoratorPattern;

/**
 * FileName: ShapeDecorator
 * author: gxs
 * Date: 2021/8/18  13:40
 */
public abstract class ShapeDecorator implements ShapeDec{
    protected ShapeDec decoratorShape;
    public ShapeDecorator(ShapeDec decoratorShape){
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
