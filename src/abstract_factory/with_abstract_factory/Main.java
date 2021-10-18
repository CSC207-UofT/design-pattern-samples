package abstract_factory.with_abstract_factory;

import abstract_factory.shape_factories.*;

public class Main {
    public static void main(String[] args) {

        /*
         * Design Pattern:
         * Abstract Factory Method
         *
         * @author: Mahsa Sadi
         * @since: 2020 - 08 - 21
         *
         *
         * Abstract Factory Method is used in cases where objects from
         * two or more hierarchies need to be generated.
         */



        /*
         * A factory method class in charge of creating circles.
         */
        ShapeFactory circleFactory = new CircleFactory();

        /*
         * A factory method class in charge of creating triangles.
         */
        ShapeFactory triangleFactory = new TriangleFactory();


        /*
         * Draw various shapes.
         */

        //get an object of type SmallCircle.
        Shape shape1 = circleFactory.getShape(ShapeType.SMALL_CIRCLE);

        //call SmallCirce's draw method
        shape1.draw();

        //get an object of type Circle.
        Shape shape2 = circleFactory.getShape(ShapeType.MEDIUM_CIRCLE);

        //call MediumCircle's draw method
        shape2.draw();

        //get an object of type Circle.
        Shape shape3 = circleFactory.getShape(ShapeType.BIG_CIRCLE);

        //call BigCircle's draw method
        shape3.draw();

        //get an object of type Triangle.
        Shape shape4 = triangleFactory.getShape(ShapeType.RIGHTANGLE_TRIANGLE);

        //call RightAngleTriangle's draw method
        shape4.draw();

        //get an object of type Triangle.
        Shape shape5 = triangleFactory.getShape(ShapeType.EQUILATERAL_TRIANGLE);

        //call EquilateralTriangle's draw method
        shape5.draw();
    }
}