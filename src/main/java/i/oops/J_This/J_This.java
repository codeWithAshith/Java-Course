package i.oops.J_This;

public class J_This {

    J_This() {
        //System.out.println("This");
    }

    public void hello() {
        System.out.println("This is sample here");
    }

    public void motor() {
        System.out.println("This is all about THIS");
        this.hello();
        this.hello();
    }

    public static void main(String[] args) {
        J_This move = new J_This(); //Instantiating the class
        move.motor(); //Invoking the motor method
    }
}
