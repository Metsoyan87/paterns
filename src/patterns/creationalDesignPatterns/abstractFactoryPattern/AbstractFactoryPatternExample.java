package patterns.creationalDesignPatterns.abstractFactoryPattern;


//Абстрактная фабрика — это творческий шаблон проектирования,
// предоставляющий интерфейс для создания семейств связанных или зависимых объектов без указания их конкретных классов.
// Шаблон абстрагирует процесс создания объекта и позволяет отделить клиентский код от конкретных классов,
// экземпляры которых создаются. Это упрощает переключение на другие реализации, не затрагивая клиентский код,
// а также упрощает тестирование клиентского кода, поскольку для целей тестирования можно использовать разные реализации.

public class AbstractFactoryPatternExample {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");
        color1.fill();
        Color color2 = colorFactory.getColor("Green");
        color2.fill();
    }
}


//В этом примере реализованы две абстрактные фабрики: ShapeFactory и ColorFactory расширяющие AbstractFactory класс.
// Класс FactoryProducer предоставляет метод для получения желаемой фабрики на основе входного аргумента.