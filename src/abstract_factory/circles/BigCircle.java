package abstract_factory.circles;

public class BigCircle extends Circle {

    public BigCircle() {
        super(100);
    }

    public void draw() {
        System.out.println("This is a big circle with radius " + radius);
    }

}