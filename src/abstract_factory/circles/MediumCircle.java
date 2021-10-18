package abstract_factory.circles;

public class MediumCircle extends Circle {


    public MediumCircle() {
        super(50);
    }

    public void draw() {
        System.out.println("This is a medium circle with radius " + radius);
    }

}