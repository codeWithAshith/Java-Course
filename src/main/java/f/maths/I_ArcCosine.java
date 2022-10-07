package f.maths;

public class I_ArcCosine {
    public static void main(String[] args) {
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);
        System.out.format("The arc cosine of %.4f is %.4f degrees %n", Math.cos(radians),
                Math.toDegrees(Math.acos(Math.sin(radians))));
    }
}
