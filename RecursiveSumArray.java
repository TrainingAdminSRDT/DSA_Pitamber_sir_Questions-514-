public class RecursiveArraySum {

    public static int sumArray(int[] arr) {
        // Start the recursion from index 0
        return sumHelper(arr, 0);
    }

    private static int sumHelper(int[] arr, int index) {
        // Base Case: If index reaches the end of the array, return 0
        if (index == arr.length) {
            return 0;
        }
        
        // Recursive Case: Current element + sum of the rest of the array
        return arr[index] + sumHelper(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int totalSum = sumArray(numbers);
        System.out.println("Sum of array: " + totalSum); // Output: 15
    }
}