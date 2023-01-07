package j.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Y_StreamReduce {
    public static void main(String[] args) {
        // process a sequence and returns a single value

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Optional - possibility of null
        Optional<Integer> sum = list.stream()
                .reduce((a, b) -> a + b);
        // 1 + 2 = 3
        // 3 + 3 = 6
        // 6 + 4 = 10
        // 10 + 5 = 15
        // 15 + 6 = 21
        System.out.println("Sum - " + sum.get());

    }
}
