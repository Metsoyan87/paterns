package patterns.BehavioralDesignPatterns.mediatorPattern;

public class MediatorPatternDemo {
    public static void main(String args[]) {

        ApnaChatRoom chat = new ApnaChatRoomImpl();

        User1 u1 = new User1(chat);
        u1.setname("Ashwani Rajput");
        u1.sendMsg("Hi Ashwani! how are you?");


        User2 u2 = new User2(chat);
        u2.setname("Soono Jaiswal");
        u2.sendMsg("I am Fine ! You tell?");
    }


}

//Преимущества:

//Это отделяет количество классов.
//Это упрощает объектные протоколы.
//Он централизует управление.
//Отдельные компоненты становятся проще и с ними намного легче работать, потому что им не нужно передавать сообщения друг другу.
//Компоненты не должны содержать логику для взаимодействия, и поэтому они являются более общими.

//Использование:
//Он обычно используется в системах, основанных на сообщениях, а также в чат-приложениях.
//Когда набор объектов взаимодействует сложными, но четко определенными способами.