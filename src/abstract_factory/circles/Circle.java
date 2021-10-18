package abstract_factory.circles;

import abstract_factory.shape_factories.Shape;


public abstract class Circle implements Shape {

    protected int radius;

    public Circle(int r) {
        radius = r;
    }

}
