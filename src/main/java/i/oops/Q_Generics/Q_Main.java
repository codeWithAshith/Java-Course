package i.oops.Q_Generics;

public class Q_Main {
    public static void main(String[] args) {
        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("Element 1");
        list.addElement("Element 2");

        MyCustomList<Integer> numberList = new MyCustomList<>();
        numberList.addElement(1);
        numberList.addElement(2);
    }
}
