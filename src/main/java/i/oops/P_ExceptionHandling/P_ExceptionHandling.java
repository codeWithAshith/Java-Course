package i.oops.P_ExceptionHandling;

public class P_ExceptionHandling {
    public static void main(String[] args) {
        try {
            int age1 = 12, age2 = 0;
            int result = age1 / age2;
            System.out.println("Result : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Sorry! 0 cannot divide an integer " + e);
        }
    }
}
