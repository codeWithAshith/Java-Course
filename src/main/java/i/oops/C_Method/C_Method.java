package i.oops.C_Method;

public class C_Method {

    String name;
    String model;
    String color;
    int tyres;

    void Method1() {
        System.out.println("This delivers content of Method1.");
    }

    void Method2() {
        System.out.println("This delivers content of Method2..");
    }

    void Method3() {
        System.out.println("This delivers content of Method3...");
    }

    static int add(int x, int y) {
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        int numbers;

        // calling method without using object
        numbers = add(30, 20);
        System.out.println(numbers);

        // calling method using object
        C_Method mainMethod = new C_Method();
        mainMethod.Method1();
        mainMethod.Method2();
        mainMethod.Method3();
    }
}