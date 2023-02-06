package patterns.structuralDesignPatterns.decoratorPattern;

public class WithMilk extends CoffeeDecorator {
    public WithMilk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }
}
