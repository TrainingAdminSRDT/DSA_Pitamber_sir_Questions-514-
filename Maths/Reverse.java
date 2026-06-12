//question7
public class Reverse {

    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Reverse obj = new Reverse();
        int x = 123;
        int result = obj.reverse(x);
        System.out.println("Reversed: " + result);
    }
}