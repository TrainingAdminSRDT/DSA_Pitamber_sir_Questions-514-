//question326
public class powerof3 {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        powerof3 obj = new powerof3();
        int n = 27;
        boolean result = obj.isPowerOfThree(n);
        System.out.println("Is Power of 3: " + result);
    }
}