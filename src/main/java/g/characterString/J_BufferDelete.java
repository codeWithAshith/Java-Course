package g.characterString;

public class J_BufferDelete {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("programming");
        sb.delete(0, 5);
        System.out.println(sb);
    }
}
