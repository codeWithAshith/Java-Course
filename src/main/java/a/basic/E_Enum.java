package a.basic;

public class E_Enum {

    public static void main(String[] args) {
        Shoes niceShoes = new Shoes();
        niceShoes.type = Shoes.ShoeType.Kids;
        System.out.println("type: " + niceShoes.type);

    }
}

class Shoes {
    enum ShoeType {Male, Female, Kids}

    ShoeType type;
}
