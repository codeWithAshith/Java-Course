package j.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S_StreamMap {
    // Transforms data from one form to another
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Grapes", "Pineapple");
        // get the length of each item in the list.
        List<Integer> integerList = fruits.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(integerList);
    }
}
