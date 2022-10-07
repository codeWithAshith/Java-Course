package e.numbers;

public class B_BoxingAndUnBoxing_Numbers {
    public static void main(String[] args) {
        Float x = 7.6f; // boxes float to a float object
        x = x + 20.0f; // unboxes the Float to a float
        System.out.println(x);
    }
}
