package k.collection.B_Linkedlist;

import java.util.LinkedList;

// LinkedList, as opposed to ArrayList, does not support fast random access.
// So, in order to find an element by index, we should traverse some portion of the list manually.

public class B_LinkedList {
    public static void main(String[] args) {
        // create linkedlist
        LinkedList<String> animals = new LinkedList<>();

        // add() method without the index parameter
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        // add() method with the index parameter
        animals.add(1, "Horse");
        System.out.println("Updated LinkedList: " + animals);

        // get the element from the linked list
        String str = animals.get(1);
        System.out.print("Element at index 1: " + str);

        // change elements at index 3
        animals.set(3, "Kotlin");
        System.out.println("Updated LinkedList: " + animals);

        // remove elements from index 1
        String remove = animals.remove(1);
        System.out.println("Removed Element: " + remove);

        System.out.println("Updated LinkedList: " + animals);
    }
}
