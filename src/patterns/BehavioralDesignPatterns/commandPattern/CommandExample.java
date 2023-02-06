package patterns.BehavioralDesignPatterns.commandPattern;


//Шаблон Command — это поведенческий шаблон проектирования в Java,
// который инкапсулирует запрос в виде объекта, что позволяет вам передавать запросы в качестве аргументов метода.
// Это также позволяет вам ставить в очередь или регистрировать запросы, а также откладывать или планировать их выполнение.
//Этот шаблон состоит из командного интерфейса, который определяет единственный метод execute(),
// и конкретных реализаций командного интерфейса. Метод execute() отвечает за выполнение связанного запроса.
// Код клиента создает объекты команды и устанавливает получателя для команды. Затем клиент передает объект команды вызывающему объекту,
// который вызывает метод execute() для команды.
//Шаблон Command полезен, когда вам нужно отделить отправителя запроса от получателя запроса
// и вы хотите передавать запросы как аргументы метода объектам. Это также полезно для реализации функций
// отмены/возврата, а также для пакетной обработки запросов.

public class CommandExample {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
    }
}

//В этом примере класс Light представляет приемник запроса,
// классы LightOnCommand и LightOffCommand представляют конкретные реализации интерфейса Command,
// а класс RemoteControl представляет инициатора. Клиентский код создает объект удаленного управления,
// задает для него команду и вызывает команду нажатием кнопки.