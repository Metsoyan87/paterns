package patterns.BehavioralDesignPatterns.observerPattern;

import java.util.Observable;
import java.util.Observer;

//В шаблоне наблюдателя говорится, что «просто определите зависимость «один к одному»,
// чтобы при изменении состояния одного объекта все его иждивенцы уведомлялись и обновлялись автоматически».
//Шаблон наблюдателя также известен как зависимые или публикация-подписка.

public class ResponseHandler2 implements Observer {
    private String resp;
    public void update(Observable obj, Object arg) {
        if (arg instanceof String) {
            resp = (String) arg;
            System.out.println("\nReceived Response: " + resp );
        }
    }
}

//Преимущества:

//Он описывает связь между объектами и наблюдателем.
//Он обеспечивает поддержку широковещательной связи.

//Использование:

//Когда изменение состояния в одном объекте должно отражаться в другом объекте без сохранения жесткой связи объектов.
//Когда фреймворк мы напишем и в будущем его нужно доработать новыми наблюдателями с минимальными изменениями.