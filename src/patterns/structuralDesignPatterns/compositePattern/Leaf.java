package patterns.structuralDesignPatterns.compositePattern;

public class Leaf implements Component{
    @Override
    public void operation() {
        System.out.println("Leaf operation");
    }
}
