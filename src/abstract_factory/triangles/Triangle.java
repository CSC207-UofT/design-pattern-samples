package abstract_factory.triangles;

import abstract_factory.shape_factories.Shape;

public abstract class Triangle implements Shape {

    protected double angle1, angle2, angle3;


    public Triangle (double ang1, double ang2, double ang3)
    {
        this.angle1 = ang1;
        this.angle2 = ang2;
        this.angle3 = ang3;
    }

}
