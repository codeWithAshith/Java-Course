package j.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class G_BiConsumer {
    public static void main(String[] args) {
//        Takes two arguments and return void, same as consumer
//        Add two numbers
        BiConsumer<Integer, Integer> bc1 = (x, y) -> System.out.println("Sum is - " + (x + y));
        bc1.accept(10, 20);

        BiConsumer<Integer, Integer> bc2 = (x, y) -> System.out.println("Sum is - " + (x + y));
        bc2.andThen(bc2).accept(20, 30);

//        To check both the list are of same length
        List<Integer> listOne = Arrays.asList(1, 2, 4, 5);
        List<Integer> listTwo = Arrays.asList(5, 2, 4, 7);
        BiConsumer<List<Integer>, List<Integer>> biConsumer = (list1, list2) -> {
            if (list1.size() == list2.size())
                System.out.println("TRUE");
            else
                System.out.println("FALSE");
        };
        biConsumer.accept(listOne, listTwo);
    }

}
