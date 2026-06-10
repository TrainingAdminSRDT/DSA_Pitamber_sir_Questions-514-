<<<<<<< HEAD
import java.util.*;

class MergeSort {

    static void mergeSort(int[] arr) {
        Arrays.sort(arr);
=======
public class MergeSort {

    static void mergeSort(int[] arr, int low, int high) {

        if (low >= high) return;

        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) left[i] = arr[low + i];
        for (int j = 0; j < n2; j++) right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) arr[k++] = left[i++];
        while (j < n2) arr[k++] = right[j++];
>>>>>>> 7d3da34bae6c3ec29f611818a3779c6fd722a49b
    }

    public static void main(String[] args) {

<<<<<<< HEAD
        int[] arr={5,2,8,1,3};

        mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
=======
        int[] arr = {5, 2, 9, 1, 6, 3};

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
>>>>>>> 7d3da34bae6c3ec29f611818a3779c6fd722a49b
