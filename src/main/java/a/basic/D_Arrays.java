package a.basic;

public class D_Arrays {
    public static void main(String[] args) {
        int num[] = {100, 200, -99, 70, 93};
        int i;
        for (i = 0; i <= 4; i++) {
            System.out.print(num[i] + ",");
        }
        System.out.print("\n");
        String[] names = {"Kettle", "Pot", "Cup", "Jug"};
        for (String name : names) {
            System.out.print(name + ",");
        }

        names[4] = "asdsa";
        System.out.println();

    }
}
