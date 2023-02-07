package patterns.BehavioralDesignPatterns.mementoPattern;

//Шаблон Memento говорит, что «восстановить состояние объекта до его предыдущего состояния».
// Но это должно быть сделано без нарушения инкапсуляции. Такой случай полезен в случае ошибки или сбоя.

//Паттерн Memento также известен как Token .

public class MementoPatternDemo {

    public static void main(String[] args) {

        Originator originator = new Originator();

        Caretaker careTaker = new Caretaker();

        originator.setState("State #1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(2));
        System.out.println("Third saved State: " + originator.getState());
    }

}

//Преимущества:

//Он сохраняет границы инкапсуляции.
//Это упрощает составителя.

//Использование:
//Он используется в операциях Undo и Redo в большинстве программ.
//Он также используется в транзакциях базы данных.