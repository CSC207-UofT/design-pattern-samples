package factory_method.with_factory_method;

import factory_method.shapes.Circle;
import factory_method.shapes.Oval;
import factory_method.shapes.Rectangle;
import factory_method.shapes.Shape;
import factory_method.shapes.Square;

public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType) {

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("ROUND SHAPE")) {
            return new Oval();
        } else {
            System.out.println("A " + shapeType.toLowerCase() + " is an undefined shape for this program.");
            return null;
        }
    }
}