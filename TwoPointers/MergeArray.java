//question88
import java.util.Arrays;

public class MergeArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        MergeArray obj = new MergeArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        obj.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}