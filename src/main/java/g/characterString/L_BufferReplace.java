package g.characterString;

public class L_BufferReplace {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Code With ");
        sb.replace(5, 13, "Ashith");
        System.out.println(sb);
    }
}
