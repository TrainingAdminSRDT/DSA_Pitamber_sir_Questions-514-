 //first_last_occurence in sorting array with duplicates
import java.util.*;     
import java.io.*;
public class first_last_occurence {     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find first and last occurrence: ");
        int key = sc.nextInt();
        int firstOccurrence = findFirstOccurrence(arr, key);
        int lastOccurrence = findLastOccurrence(arr, key);
        
        if (firstOccurrence == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("First occurrence of " + key + " is at index: " + firstOccurrence);
            System.out.println("Last occurrence of " + key + " is at index: " + lastOccurrence);
        }
    }

    public static int findFirstOccurrence(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index of the first occurrence
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static int findLastOccurrence(int[] arr, int key) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == key) {
                return i; // Return the index of the last occurrence
            }
        }
        return -1; // Return -1 if the element is not found
    }
}