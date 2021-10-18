package factory_method.shapes;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("A square is drawn.");
    }
}