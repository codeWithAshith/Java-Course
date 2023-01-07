package j.java8;

import java.util.stream.Stream;

public class P_Stream {
//        Sequence of data
//        Can be performed either sequentially or parallel
//        Does not support indexed access
//        Designed for lambdas

//        Collection or arrays provides data to stream
//        Streams does not change the original data
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(0, 1, 2, 4, 5);
        s1.forEach(p -> System.out.println(p));

        System.out.println("---Array into Stream---");
        // convert array to stream
        Integer arr[] = new Integer[]{1, 2, 3, 4, 5, 6};
        Stream<Integer> s2 = Stream.of(arr);
        s2.forEach(p -> System.out.println(p));
    }
}
