package j.java8;

import java.util.function.Function;

public class M_FunctionalInterface {
    public static void main(String[] args) {
//        <Input, Return Type>
        Function<String, Integer> f1 = s -> s.length();
        Function<String, String> f2 = s -> s.toUpperCase();
        Function<String, String> f3 = s -> s.toUpperCase().concat(" features");

        int length = f1.apply("Java8");
        System.out.println("Length - " + length);
        System.out.println("And Then - " + f2.andThen(f3).apply("Java8"));
        System.out.println("Compose - " + f2.compose(f3).apply("Java8"));
    }
}
