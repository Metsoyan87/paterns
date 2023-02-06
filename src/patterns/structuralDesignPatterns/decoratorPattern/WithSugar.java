package patterns.structuralDesignPatterns.decoratorPattern;

public class WithSugar extends CoffeeDecorator {
    public WithSugar(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Sugar";
    }
}