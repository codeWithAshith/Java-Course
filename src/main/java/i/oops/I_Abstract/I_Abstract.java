package i.oops.I_Abstract;

public class I_Abstract extends Car {

    void motor() {
        System.out.println("I love Corolla");
    }

    public static void main(String[] args) {
        Car toyota = new I_Abstract();
        toyota.motor();
    }
}
