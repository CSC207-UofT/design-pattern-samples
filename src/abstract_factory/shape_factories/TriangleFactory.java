package abstract_factory.shape_factories;

import abstract_factory.triangles.*;

public class TriangleFactory implements ShapeFactory {

    @Override
    public Shape getShape(ShapeType type) {

        if (type == ShapeType.EQUILATERAL_TRIANGLE)
            return new EquilateralTriangle();

        else if (type == ShapeType.RIGHTANGLE_TRIANGLE)
            return new RightAngleTriangle();
        else
            return null;
    }

}
