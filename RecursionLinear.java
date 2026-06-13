//Linear Search using Recursion

import java.util.Scanner;
public class RecursionLinear {
    public static int LinearSearch(int[] arr, int target, int index){
        if(index == arr.length){
            return -1; // Target not found
        }
        if(arr[index] == target){
            return index; // Target found at index
        }
        return LinearSearch(arr, target, index + 1); // Search in the rest of the array
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Enter the target number to search: ");
        int target = sc.nextInt();
        int result = LinearSearch(arr, target, 0);
        if(result != -1){
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
