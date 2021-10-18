package factory_method.shapes;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("A rectangle is drawn.");
    }
}