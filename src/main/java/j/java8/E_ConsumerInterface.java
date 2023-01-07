package j.java8;

import java.util.function.Consumer;

public class E_ConsumerInterface {
    public static void main(String[] args) {
        // To perform an operation, takes one argument and return void
        Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
        c1.accept("Java8 Features");
        Consumer<String> c2 = s -> System.out.println(s.toLowerCase());
        c1.accept("JAVA8 FEATURES");

        System.out.println("---AND THEN---");

        // To combine both c1, c2 - should be of same return type -
        Consumer<String> c3 = s -> System.out.println(s.toUpperCase());
        c1.andThen(c2).accept("Java8 Features");



    }
}
