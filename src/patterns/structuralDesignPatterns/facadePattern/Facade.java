package patterns.structuralDesignPatterns.facadePattern;

public class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;

    public Facade(SubsystemA subsystemA, SubsystemB subsystemB) {
        this.subsystemA = subsystemA;
        this.subsystemB = subsystemB;
    }

    public void methodA() {
        subsystemA.methodA();
    }

    public void methodB() {
        subsystemB.methodB();
    }
}
