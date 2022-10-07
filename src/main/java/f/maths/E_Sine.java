package f.maths;

public class E_Sine {
    public static void main(String[] args) {
        double degrees = 125.0;
        double radians = Math.toRadians(degrees);
        System.out.format("The sine of %.1f degrees is %.4f%n", degrees, Math.sin(radians));
    }
}
