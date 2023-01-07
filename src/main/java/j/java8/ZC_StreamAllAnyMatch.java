package j.java8;

import java.util.Arrays;
import java.util.List;

public class ZC_StreamAllAnyMatch {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Grapes", "Pineapple");

        // returns true if the condition is matched by all items in the list
        System.out.println("All match " + fruits.stream()
                .allMatch(s -> s.length() > 4));

        // returns true if the condition is matched by any item in the list
        System.out.println("Any match " + fruits.stream()
                .anyMatch(s -> s.length() > 6));
    }
}
