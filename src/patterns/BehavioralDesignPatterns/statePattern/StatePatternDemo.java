package patterns.BehavioralDesignPatterns.statePattern;

//Паттерн состояния говорит, что «поведение класса изменяется в зависимости от его состояния».
// В State Pattern мы создаем объекты, представляющие различные состояния, и объект контекста,
// поведение которого меняется по мере изменения его объекта состояния.


//Шаблон состояния также известен как объекты для состояний.

public class StatePatternDemo {

    Controller controller;
    StatePatternDemo(String con) {
        controller = new Controller();
        //the following trigger should be made by the user
        if(con.equalsIgnoreCase("management"))
            controller.setManagementConnection();
        if(con.equalsIgnoreCase("sales"))
            controller.setSalesConnection();
        if(con.equalsIgnoreCase("accounting"))
            controller.setAccountingConnection();
        controller.open();
        controller.log();
        controller.close();
        controller.update();
    }


    public static void main(String args[]) {

        new StatePatternDemo(args[0]);

    }

}

//Преимущества:

//Он сохраняет поведение, зависящее от состояния.
//Это делает любые переходы между состояниями явными.

//Использование:

//Когда поведение объекта зависит от его состояния, и он должен иметь возможность изменять свое поведение во время выполнения в соответствии с новым состоянием.
//Он используется, когда операции имеют большие составные условные операторы, зависящие от состояния объекта.