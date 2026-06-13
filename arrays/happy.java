import java.util.Scanner;
import java.util.HashSet;

public class happy {

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);

            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isHappy(n)) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not a Happy Number");
        }

        sc.close();
    }
}
