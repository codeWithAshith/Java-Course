package e.numbers;

public class A_Numbers {
    public static void main(String[] args) {
        Integer a = 2;

//        byte byteValue ()
//        short shortValue ()
//        int intValue ()
//        long longValue ()
//        float floatValue ()
//        double doubleValue ()

        System.out.println(a.intValue());
        System.out.println(a.shortValue());
        System.out.println(a.longValue());
        System.out.println(a.floatValue());
        System.out.println(a.doubleValue());
        System.out.println(a.byteValue());

        System.out.format("The value of pi is %.4f%n", Math.PI);
    }
}
