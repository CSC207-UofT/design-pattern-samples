package factory_method.with_factory_method;

public class Main {
    public static void main(String[] args) {

        Canvas canvas = new Canvas();
        String[] shapeNames = {"ROUND SHAPE", "RECTANGLE", "SQUARE", "PENTAGON"};

        for (String shapeName : shapeNames)
            canvas.addShape(shapeName);

    }
}