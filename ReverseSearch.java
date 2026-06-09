// Reverse search by Recursion 
import java.util.Scanner;
public class ReverseSearch {        
    public static int ReverseSearch(int[] arr, int target, int index){
        if(index < 0){
            return -1; // Target not found
        }
        if(arr[index] == target){
            return index; // Target found at index
        }
        return ReverseSearch(arr, target, index - 1); // Search in the rest of the array
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Enter the target number to search: ");
        int target = sc.nextInt();
        int result = ReverseSearch(arr, target, arr.length - 1);
        if(result != -1){
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}