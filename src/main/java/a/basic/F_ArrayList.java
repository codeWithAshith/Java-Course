package a.basic;

import java.util.ArrayList;
import java.util.LinkedList;

public class F_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // add
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        // index - same as array
        System.out.println("Index - " + arrayList.get(0));

        System.out.println("Size - " + arrayList.size());
        arrayList.remove(2);
        System.out.println("Size - " + arrayList.size());
        System.out.println("List - " + arrayList);

        // array list works based on list - so removing the item at the last takes more time
        // as they have to shift the items back

        // Linked list - removing is faster, adding to the front and back is faster. But traversing is slow
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
    }
}
