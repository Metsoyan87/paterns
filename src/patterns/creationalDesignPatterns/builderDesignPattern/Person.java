package patterns.creationalDesignPatterns.builderDesignPattern;


//Шаблон Builder — это шаблон проектирования в разработке программного обеспечения,
// используемый для пошагового создания объектов, обеспечивающий гибкое и эффективное решение для создания объектов.
// Это особенно полезно, когда объекты имеют много полей или параметров конфигурации,
// и вы хотите предоставить четкий и лаконичный способ создания экземпляров этих объектов.
//В Java шаблон построителя обычно реализуется с использованием вложенного статического класса
// (класса построителя) внутри основного класса. Класс построителя имеет методы для установки каждого свойства объекта и метод build(),
// который создает окончательный объект. Класс построителя часто используется в сочетании с конструктором в основном классе,
// который принимает построитель в качестве аргумента и использует значения, хранящиеся в построителе, для установки свойств объекта.
//Вот пример простого класса Java, использующего шаблон Builder:


public class Person {
    private final String name;
    private final int age;
    private final String address;

    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
}
    public static class PersonBuilder {
        private final String name;
        private int age;
        private String address;

        public PersonBuilder(String name) {
            this.name = name;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

//А вот пример того, как можно использовать конструктор для создания экземпляра Person класса: