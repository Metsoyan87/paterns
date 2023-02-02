package patterns.creationalDesignPatterns.prototypeDesignPattern;

public class ConcretePrototype2 implements Prototype {

    private final String NAME = "Prototype2";

    @Override
    public Prototype getClone() {
        return new ConcretePrototype2();
    }

    public String getName() {
        return NAME;
    }
}
