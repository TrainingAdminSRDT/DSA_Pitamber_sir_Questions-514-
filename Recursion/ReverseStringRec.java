public class ReverseStringRec {
    public String reverse(String s) {
        if (s.length() <= 1) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        ReverseStringRec obj = new ReverseStringRec();
        String s = "hello";
        System.out.println("Reversed: " + obj.reverse(s));
    }
}