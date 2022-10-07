package i.oops.M_Encapsulation;

public class M_Encapsulation {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        M_Encapsulation write = new M_Encapsulation();
        write.setName("C Ronaldo ");
        write.setNumber(7);
        System.out.println("His name is " + write.getName() + write.getNumber());
    }
}
