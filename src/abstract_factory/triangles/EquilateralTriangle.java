package abstract_factory.triangles;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle() {
        super(60, 60, 60);
    }

    @Override
    public void draw() {
        System.out.println("This is a medium circle with angles " + angle1 + ", " + angle2 + ", " + angle3);

    }

}
