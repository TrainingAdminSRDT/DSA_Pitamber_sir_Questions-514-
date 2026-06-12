//question1281
public class subtractProduct {
    public int subtractProductAndSum(int n) {
        int product = prod(n);
        int sum = add(n);
        return product - sum;
    }

    public int add(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int prod(int n) {
        int product = 1;
        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }
        return product;
    }

    public static void main(String[] args) {
        subtractProduct obj = new subtractProduct();
        int n = 234;
        int result = obj.subtractProductAndSum(n);
        System.out.println("Result: " + result);
    }
}