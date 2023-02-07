package patterns.BehavioralDesignPatterns.strategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Шаблон стратегии говорит, что «определяет семейство функций, инкапсулирует каждую из них и делает их взаимозаменяемыми».

//Шаблон стратегии также известен как политика.

public class StrategyPatternDemo {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first value: ");
        float value1=Float.parseFloat(br.readLine());
        System.out.print("Enter the second value: ");
        float value2=Float.parseFloat(br.readLine());
        Context context = new Context(new Addition());
        System.out.println("Addition = " + context.executeStrategy(value1, value2));

        context = new Context(new Subtraction());
        System.out.println("Subtraction = " + context.executeStrategy(value1, value2));

        context = new Context(new Multiplication());
        System.out.println("Multiplication = " + context.executeStrategy(value1, value2));
    }

}

//Преимущества:

//Он обеспечивает замену подклассов.
//Он определяет каждое поведение в своем собственном классе, устраняя необходимость в условных операторах.
//Это упрощает расширение и внедрение нового поведения без изменения приложения.

//Использование:

//Когда несколько классов отличаются только своим поведением. Например, Servlet API.
//Он используется, когда вам нужны разные варианты алгоритма.