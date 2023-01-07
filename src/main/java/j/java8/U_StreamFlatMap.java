package j.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class U_StreamFlatMap {
    public static void main(String[] args) {
        List<Integer> oddNumbers = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8, 10);

        List<List<Integer>> listOfList = Arrays.asList(oddNumbers, evenNumbers);
        System.out.println("Before flat map - " + listOfList);

        List<Integer> flattenList = listOfList.stream() // stream of list of list
                .flatMap(List::stream) // stream of list
                .collect(Collectors.toList());

        System.out.println("After flat map -" + flattenList);
    }
}
