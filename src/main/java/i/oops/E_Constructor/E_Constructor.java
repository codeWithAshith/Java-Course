package i.oops.E_Constructor;

public class E_Constructor {
    int num1 = 30;
    int num2 = 20;

    E_Constructor() {
        System.out.println("This is a constructor");
    }

    public void display() {
        System.out.println("The value of num1 is " + num1);
        System.out.println("The value of num2 is " + num2);
    }

    public static void main(String[] args) {
        E_Constructor con = new E_Constructor();
        con.display();
    }
}
