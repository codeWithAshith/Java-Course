package n.threads;

public class A_Main {
    public static void main(String[] args) {
        for (int i = 0; i < 199; i++) {
            System.out.println(i + "");
        }
        System.out.println("Task 1 done");

        for (int i = 0; i < 199; i++) {
            System.out.println(i + "");
        }
        System.out.println("Task 2 done");

        for (int i = 0; i < 199; i++) {
            System.out.println(i + "");
        }
        System.out.println("Task 3 done");
    }
}
