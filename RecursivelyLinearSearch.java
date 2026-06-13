public class RecursiveLinearSearch {

    // Main function called by the user
    public static int linearSearch(int[] arr, int target) {
        // Start searching from index 0
        return searchHelper(arr, target, 0);
    }

    // Helper function that handles the recursion and index tracking
    private static int searchHelper(int[] arr, int target, int index) {
        // Base Case 1: Target not found (reached the end of the array)
        if (index == arr.length) {
            return -1;
        }

        // Base Case 2: Target found
        if (arr[index] == target) {
            return index;
        }

        // Recursive Case: Move to the next index
        return searchHelper(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] data = {5, 3, 8, 9, 2};
        int target = 9;

        int result = linearSearch(data, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        // Output: Element found at index: 3
    }
}