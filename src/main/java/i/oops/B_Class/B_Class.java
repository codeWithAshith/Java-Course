package i.oops.B_Class;

public class B_Class {
    String name;
    String model;
    String color;
    int tyres;

    void engine() {
        System.out.println("The car engine is very sound");
    }

    void interior() {
        System.out.println("The car interior contains the seats, steering, dashboard...");
    }

    void exterior() {
        System.out.println("The car exterior is made up of the color, the tyres...");
    }

    public static void main(String[] args) {
        B_Class motor = new B_Class();
        motor.engine();
        motor.interior();
        motor.exterior();
    }
}
