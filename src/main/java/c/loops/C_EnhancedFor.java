package c.loops;

public class C_EnhancedFor {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        for (int x : numbers) {
            System.out.print(x + ",");
        }
        System.out.print("\n");
        String[] names = {"Kettle", "Pot", "Cup", "Jug"};
        for (String name : names) {
            System.out.print(name + ",");
        }
    }
}
