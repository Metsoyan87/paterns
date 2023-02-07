package patterns.BehavioralDesignPatterns.iteratorPattern;

//«для последовательного доступа к элементам агрегатного объекта без раскрытия его базовой реализации».

//Шаблон Iterator также известен как Cursor.

public class IteratorPatternDemo {

    public static void main(String[] args) {
        CollectionofNames cmpnyRepository = new CollectionofNames();

        for (Iterator iter = cmpnyRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
//Преимущество шаблона итератора
//Он поддерживает варианты обхода коллекции.
//Это упрощает интерфейс к коллекции.
//Когда вы хотите получить доступ к коллекции объектов, не раскрывая ее внутреннее представление.
//Когда в коллекции необходимо поддерживать несколько обходов объектов.