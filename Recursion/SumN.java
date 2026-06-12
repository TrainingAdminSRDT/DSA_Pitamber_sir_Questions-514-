public class SumN {
    public int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        SumN obj = new SumN();
        int n = 5;
        System.out.println("Sum: " + obj.sum(n));
    }
}