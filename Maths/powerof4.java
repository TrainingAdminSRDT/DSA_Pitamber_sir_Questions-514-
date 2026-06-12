//question342
public class powerof4 {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        powerof4 obj = new powerof4();
        int n = 64;
        boolean result = obj.isPowerOfFour(n);
        System.out.println("Is Power of 4: " + result);
    }
}