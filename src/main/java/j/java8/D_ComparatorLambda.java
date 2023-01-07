package j.java8;

import java.util.Comparator;

public class D_ComparatorLambda {
    public static void main(String[] args) {
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return x.compareTo(y);
            }
        };

        System.out.println("Before Java 8 - " + c1.compare(20, 20));
        System.out.println("Before Java 8 - " + c1.compare(20, 10));
        System.out.println("Before Java 8 - " + c1.compare(10, 20));

//        Comparator<Integer> c2 = (x, y) -> x.compareTo(y);
        Comparator<Integer> c2 = Integer::compareTo;

        System.out.println("Java 8 - " + c2.compare(20, 20));
        System.out.println("Java 8 - " + c2.compare(20, 10));
        System.out.println("Java 8 - " + c2.compare(10, 20));
    }
}
