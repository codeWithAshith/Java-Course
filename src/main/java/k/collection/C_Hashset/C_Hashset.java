package k.collection.C_Hashset;

import java.util.HashSet;
import java.util.Iterator;

// In the Set, duplicate items will not be printed in the output and will not be taken into account.

// HashSet stores the objects in random order,
// whereas TreeSet applies the natural order of the elements.

// Simply put, HashSet is faster than the TreeSet.

// If we want to keep our entries sorted, we need to go for the TreeSet
// If we value performance more than memory consumption, we should go for the HashSet

public class C_Hashset {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();

        // Using add() method
        evenNumber.add(29);
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(4);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();

        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(1);
        System.out.println("New HashSet: " + numbers);

        // Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("HashSet using Iterator: ");
        // Accessing elements
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        // Using remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);    }

}
