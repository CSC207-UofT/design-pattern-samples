package factory_method.without_factory_method;

import factory_method.shapes.*;

public class Canvas {

    public void addShape(String type) {
        Shape shape;

        if (type.equalsIgnoreCase("CIRCLE")) {
            shape = new Circle();
        } else if (type.equalsIgnoreCase("RECTANGLE")) {
            shape = new Rectangle();
        } else if (type.equalsIgnoreCase("SQUARE")) {
            shape = new Square();
        } else if (type.equalsIgnoreCase("ROUND SHAPE")) {
            shape = new Oval();
        } else {
            System.out.println("A " + type.toLowerCase() + " is an undefined shape for this program.");
            return;
        }

        shape.draw();
    }

}
