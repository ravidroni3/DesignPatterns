public class Main {
    public static void main(String[] args) throws RuntimeException{
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("rectangle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory1.getShape("rectangle");
        shape3.draw();
        Shape shape4 = shapeFactory1.getShape("square");
        shape4.draw();
    }

}
