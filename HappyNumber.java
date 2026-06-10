import java.util.HashSet;

public class HappyNumber {

    private static int getNext(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public static boolean isHappy(int n) {

        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
