package j.java8;

import java.util.function.Predicate;

public class I_Predicate {
    // Accepts only one input
    // returns true or false
    public static void main(String[] args) {
//        Predicate<Integer> predicate = a -> {
//            return a > 50;
//        };
        Predicate<Integer> predicateLessThan = a -> a > 50;
        System.out.println(predicateLessThan.test(20));

        Predicate<Integer> predicateGreaterThan = a -> a < 50;
        Predicate<Integer> predicateEqualThan = a -> a == 50;

        // and - both true returns true
        // or - any one true returns true
        System.out.println(predicateLessThan.and(predicateGreaterThan).test(30));

    }
}
