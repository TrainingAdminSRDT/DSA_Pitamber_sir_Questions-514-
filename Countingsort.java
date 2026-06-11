import java.util.Arrays;

public class Countingsort {
    public static void countingSort(int[] arr) {
        if (arr.length == 0) return;

        
        int max = Arrays.stream(arr).max().getAsInt();

        
        int[] count = new int[max + 1];
        for (int num : arr) {
            count[num]++;
        }

        
        int idx = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[idx++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 2, 3, 3, 4, 8]
    }
}
