package factory_method.with_factory_method;

import factory_method.shapes.*;

public class Canvas {

    private final ShapeFactory factory;

    public Canvas() {
        factory = new ShapeFactory();
    }

    public void addShape(String shapeName) {
        Shape shape;
        shape = factory.getShape(shapeName);
        if (shape != null)
            shape.draw();
    }

}
