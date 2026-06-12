//question202
import java.util.HashSet;
public class happy {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getSumOfSquares(n);
        }
        return n == 1;
    }

    private int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        happy obj = new happy();
        int n = 19;
        boolean result = obj.isHappy(n);
        System.out.println("Is Happy Number: " + result);
    }
}