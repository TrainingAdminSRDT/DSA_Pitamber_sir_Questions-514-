//missing number in 1 to n of an array
import java.util.*;
import java.io.*;
public class missing_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int missingNumber = findMissingNumber(arr, size + 1);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n - 1) / 2; // Sum of first n-1 natural numbers
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num; // Sum of elements in the array
        }
        return totalSum - arraySum; // The missing number is the difference
    }
    
}
