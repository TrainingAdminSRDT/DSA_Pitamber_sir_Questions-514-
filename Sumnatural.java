// sum of first n natural numbers
import java.util.Scanner;
public class Sumnatural {   
    public static int sum(int n){
        if(n == 0){
            return 0; // Base case: sum of first 0 natural numbers is 0
        }
        return n + sum(n - 1); // Recursive case: n + sum of first (n-1) natural numbers
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + result);
    }
}