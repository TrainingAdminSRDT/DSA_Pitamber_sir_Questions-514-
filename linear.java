//Recursive linear search in java
import java.util.*;
import java.io.*;
public class linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();
        int result = recursiveLinearSearch(arr, key, 0);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int recursiveLinearSearch(int[] arr, int key, int index) {
        // Base case: if index is out of bounds, return -1
        if (index >= arr.length) {
            return -1;
        }
        // If element is found at current index, return the index
        if (arr[index] == key) {
            return index;
        }
        // Recursive case: search in the rest of the array
        return recursiveLinearSearch(arr, key, index + 1);
    }
}
