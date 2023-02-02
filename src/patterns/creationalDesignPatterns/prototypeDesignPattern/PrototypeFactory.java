package patterns.creationalDesignPatterns.prototypeDesignPattern;

import java.util.HashMap;

public class PrototypeFactory {
    private static final HashMap<String, Prototype> prototypes = new HashMap<>();

    static {
        prototypes.put("Prototype1", new ConcretePrototype1());
        prototypes.put("Prototype2", new ConcretePrototype2());
    }

    public static Prototype getPrototype(String type) {
        return prototypes.get(type).getClone();
    }
}
