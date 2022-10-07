package i.oops.A_Object;

public class A_Object {

    String name = "Corolla";
    String model = "2020";
    String color = "Ash";
    int tyres = 4;

    public static void main(String[] args) {

        A_Object obj = new A_Object();
        System.out.println("Name is " + obj.name);
        System.out.println(obj.model);
        System.out.println(obj.color);
        System.out.println(obj.tyres);
    }
}
