package j.java8;

import java.util.stream.IntStream;

public class A_Java7vsJava8 {
    public static void main(String[] args) {
        // Before Java8
        int total7 = 0;
        for (int i = 0; i < 50; i++) {
            total7 = total7 + i;
        }
        System.out.println("Before Java 7 - " + total7);

        // Java 8
        int total8 = IntStream.range(0, 50).sum();
        System.out.println("Java 8 - " + total8);
    }
}
