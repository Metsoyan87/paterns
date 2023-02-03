package patterns.creationalDesignPatterns.objectPoolPattern;

import java.util.ArrayList;
import java.util.List;

public class ObjectPool <T>{
    private List<T> availableObjects;
    private List<T> inUseObjects;

    public ObjectPool(List<T> objects) {
        availableObjects = objects;
        inUseObjects = new ArrayList<T>();
    }

    public synchronized T checkOut() {
        if (availableObjects.isEmpty()) {
            return null;
        }
        T obj = availableObjects.remove(0);
        inUseObjects.add(obj);
        return obj;
    }

    public synchronized void checkIn(T obj) {
        inUseObjects.remove(obj);
        availableObjects.add(obj);
    }
}

//В этом примере ObjectPool класс управляет списком доступных объектов и списком используемых объектов.
// Метод checkOut возвращает доступный объект и добавляет его в список используемых.
// Метод checkIn берет объект и добавляет его обратно в список доступных.
// Ключевое synchronized слово гарантирует, что метод является потокобезопасным,
// позволяя нескольким потокам одновременно использовать пул объектов.