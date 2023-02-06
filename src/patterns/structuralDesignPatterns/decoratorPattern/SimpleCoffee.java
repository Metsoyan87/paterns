package patterns.structuralDesignPatterns.decoratorPattern;

public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
}
