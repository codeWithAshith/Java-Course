package j.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B_Java7vsJava8 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("a", "b", "c", "a");

        // Remove duplicate before using Java 8
        List<String> uniqueList = new ArrayList<>();
        for (String name : names) {
            if (!uniqueList.contains(name)) {
                uniqueList.add(name);
            }
        }
        System.out.println("Before Java 8 - " + uniqueList);

        // Remove duplicate using Java 8
        List<String> uniqueList8 = names
                .stream()
                .distinct().toList();
        System.out.println("Java 8 - " + uniqueList8);
    }
}
