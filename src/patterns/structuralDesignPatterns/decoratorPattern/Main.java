package patterns.structuralDesignPatterns.decoratorPattern;


//Шаблон Decorator — это шаблон проектирования в объектно-ориентированном программировании,
// который позволяет добавлять поведение к отдельному объекту статически или динамически,
// не влияя на поведение других объектов того же класса. Этот шаблон включает в себя набор классов декораторов,
// которые используются для обертывания конкретных компонентов. Декораторы предоставляют
// гибкую альтернативу подклассам для расширения функциональности.

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.getCost() + "; Ingredients: " + coffee.getIngredients());

        coffee = new WithMilk(coffee);
        System.out.println("Cost: " + coffee.getCost() + "; Ingredients: " + coffee.getIngredients());

        coffee = new WithSugar(coffee);
        System.out.println("Cost: " + coffee.getCost() + "; Ingredients: " + coffee.getIngredients());
    }
}

//Использование шаблона декоратора
//Когда вы хотите прозрачно и динамично добавлять обязанности к объектам, не затрагивая другие объекты.
//Когда вы хотите добавить обязанности к объекту, который вы, возможно, захотите изменить в будущем.
//Расширение функциональности за счет создания подклассов больше нецелесообразно.