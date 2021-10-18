package factory_method.shapes;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("A circle is drawn.");
    }
}