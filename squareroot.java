//Square root of a number without using built in function
import java.util.*; 
import java.io.*;
public class squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int result = squareRoot(num);
        if (result == -1) {
            System.out.println("Square root not found");
        } else {
            System.out.println("Square root of " + num + " is: " + result);
        }
    }]

    

    public static int squareRoot(int num) {
        if (num < 0) {
            return -1; // Square root is not defined for negative numbers
        }
        for (int i = 0; i * i <= num; i++) {
            if (i * i == num) {
                return i; // Return the integer square root
            }
        }
        return -1; // Return -1 if no perfect square root is found
    }
}