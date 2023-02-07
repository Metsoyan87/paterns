package patterns.BehavioralDesignPatterns.templatePattern;

//Шаблон шаблона говорит, что «просто определите скелет функции в операции, откладывая некоторые шаги на ее подклассы».

public class TemplatePatternDemo {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

        Class c=Class.forName(args[0]);
        Game game=(Game) c.newInstance();
        game.play();
    }
}
//Преимущества:
//Это очень распространенный метод повторного использования кода. Это только основное его преимущество.

//Использование:
//Он используется, когда общее поведение среди подклассов должно быть перемещено в один общий класс, избегая дублирования.