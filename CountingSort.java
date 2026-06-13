import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Already sorted or empty
        }

        // 1. Find the maximum and minimum values to handle ranges/negatives
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        // 2. Store the count of each element
        // (Subtract 'min' to map the values to a 0-indexed count array)
        for (int num : arr) {
            count[num - min]++;
        }

        // 3. Change count[i] so that it contains the actual 
        // position of this element in the output array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // 4. Build the output array 
        // (Iterate backwards to maintain stability)
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // 5. Copy the sorted elements back into the original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    // Driver method to test the algorithm
    public static void main(String[] args) {
        int[] data = {4, -2, 2, 8, -3, 3, 1};
        System.out.println("Original Array: " + Arrays.toString(data));
        
        countingSort(data);
        
        System.out.println("Sorted Array:   " + Arrays.toString(data));
    }
}