package abstract_factory.shape_factories;

public interface ShapeFactory {

    Shape getShape(ShapeType type);

}