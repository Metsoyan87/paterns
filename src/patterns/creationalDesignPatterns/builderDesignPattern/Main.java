package patterns.creationalDesignPatterns.builderDesignPattern;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("John")
                .age(30)
                .address("123 Main St")
                .build();
    }
}
