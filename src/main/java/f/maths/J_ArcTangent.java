package f.maths;

public class J_ArcTangent {
    public static void main(String[] args) {
        double degrees = 55.0;
        double radians = Math.toRadians(degrees);
        System.out.format("The arc tangent of %.4f is %.4f degrees %n", Math.cos(radians), Math.toDegrees(Math.atan(Math.sin(radians))));
    }
}
