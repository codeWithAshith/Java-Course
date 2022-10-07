package i.oops.H_Interface;

public class H_Interface implements Output {
    public void display() {
        System.out.println("This is sample of interface class");
    }

    public static void main(String[] args) {
        H_Interface face = new H_Interface();
        face.display();
    }
}
