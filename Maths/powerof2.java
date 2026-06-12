//question231
public class powerof2 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        powerof2 obj = new powerof2();
        int n = 16;
        boolean result = obj.isPowerOfTwo(n);
        System.out.println("Is Power of 2: " + result);
    }
}