package patterns.creationalDesignPatterns.prototypeDesignPattern;

public class ConcretePrototype1 implements Prototype{
    private final String NAME = "Prototype1";

    @Override
    public Prototype getClone() {
        return new ConcretePrototype1();
    }

    public String getName() {
        return NAME;
    }
}
