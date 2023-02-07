package patterns.BehavioralDesignPatterns.interpreterPatternExample1;


//Шаблон интерпретатора — это шаблон проектирования, используемый при разработке программного обеспечения,
// который определяет способ оценки языковой грамматики или выражений. Он включает в себя определение грамматического
// представления языка и интерпретатора, который может анализировать и оценивать предложения, написанные на этом языке.

//В Java шаблон интерпретатора реализован с использованием иерархии классов,
// где каждый класс представляет символ в грамматике. Основной класс, называемый «Интерпретатор»,
// использует эти классы символов для разбора и оценки предложений на языке.

//Пример. Рассмотрим простой язык выражений, поддерживающий сложение и вычитание неотрицательных целых чисел.
// Шаблон Interpreter можно использовать для создания интерпретатора для этого языка. Грамматика выражений для
// этого языка может быть представлена ​​с помощью следующих классов:

//TerminalExpression (представляет неотрицательное целое число)
//AdditionExpression (представляет собой сложение двух выражений)
//SubtractionExpression (представляет вычитание двух выражений)
//Затем класс Interpreter может использовать эти классы для разбора и оценки выражений языка.

public class AdditionExpression implements Expression {

    private Expression num1;
    private Expression num2;

    public AdditionExpression(Expression num1, Expression num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public int interpret() {
        return num1.interpret() + num2.interpret();
    }
}



