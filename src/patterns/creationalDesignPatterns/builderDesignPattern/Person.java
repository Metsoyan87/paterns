package patterns.creationalDesignPatterns.builderDesignPattern;

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