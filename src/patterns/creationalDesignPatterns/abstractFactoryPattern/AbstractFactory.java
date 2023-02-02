package patterns.creationalDesignPatterns.abstractFactoryPattern;

abstract  class AbstractFactory {

    abstract Shape getShape(String shapeType);
    abstract Color getColor(String colorType);
}
