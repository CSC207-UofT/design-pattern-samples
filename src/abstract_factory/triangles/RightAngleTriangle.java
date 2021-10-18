package abstract_factory.triangles;

public class RightAngleTriangle extends Triangle {


    public RightAngleTriangle() {
        super(90, 30, 60);
    }

    @Override
    public void draw() {
        System.out.println("This is a medium circle with angles " + angle1 + ", " + angle2 + ", " + angle3);

    }

}
