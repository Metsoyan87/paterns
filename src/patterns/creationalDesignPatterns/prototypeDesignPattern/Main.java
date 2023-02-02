package patterns.creationalDesignPatterns.prototypeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Prototype prototype1 = PrototypeFactory.getPrototype("Prototype1");
        System.out.println("Prototype1 name: " + prototype1.getClass().getName());

        Prototype prototype2 = PrototypeFactory.getPrototype("Prototype2");
        System.out.println("Prototype2 name: " + prototype2.getClass().getName());
    }
}

//В этом примере определяется Prototype интерфейс с одним getClone методом,
// который должен возвращать новый экземпляр того же типа. Два конкретных класса
// ConcretePrototype1и ConcretePrototype2реализуют Prototype интерфейс. Класс PrototypeFactory
// содержит статические HashMap прототипы, которые можно клонировать с помощью getPrototype метода. Н
// аконец, Main класс демонстрирует, как использовать PrototypeFactory для создания новых прототипов.