//question50
public class pow {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            return 1.0 / power(x, -N);
        }
        return power(x, N);
    }

    public double power(double x, long n) {
        if (n == 0) return 1.0;
        if (n == 1) return x;
        if (n % 2 == 0) {
            return power(x * x, n / 2);
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        pow obj = new pow();
        double x = 2.0;
        int n = 10;
        double result = obj.myPow(x, n);
        System.out.println("Power Result: " + result);
    }
}