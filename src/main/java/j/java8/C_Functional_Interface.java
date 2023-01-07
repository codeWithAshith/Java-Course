package j.java8;

public class C_Functional_Interface {

    // Lambda is same as a function
    // Call it as an anonymous function with parameters, body and return type
    // Not tied to a class
    // Can be assigned to a variable
    public static void main(String[] args) {
        // Before Java 8
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread -1");
            }
        };
        new Thread(r1).start();

        // In Java 8
        // Runnable r2 = () -> ();
        Runnable r2 = () -> System.out.println("Thread -2");
        new Thread(r2).start();

        // Before Java 8
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread -3");
            }
        }).start();

        // In Java 8
        new Thread(() -> {
            System.out.println("Thread -4");
        }).start();
    }

}

// Function interface - is an interface that contains only once abstract method
// Can contain only default and static method


// This annotation is optional
@FunctionalInterface
interface Interface {
    void add();
//    void sub(); - Functional interface cannot have two methods

    default void methodOne() {
        System.out.println("Message possible with java 8");
    }

    static void methodsTwo() {
        System.out.println("Message possible with java 8");
    }

}
