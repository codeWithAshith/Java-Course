package i.oops.Q_Generics;

import java.util.ArrayList;

public class MyCustomList<T> {

    private ArrayList<T> list = new ArrayList<T>();

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }
}
