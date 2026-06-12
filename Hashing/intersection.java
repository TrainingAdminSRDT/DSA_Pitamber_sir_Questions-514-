//question 349
import java.util.*;

public class intersection {

    public int[] Intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> dynamicArray = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], 1);
        }

        for (int j = 0; j < nums2.length; j++) {
            if (map.containsKey(nums2[j]) && map.get(nums2[j]) != 0) {
                dynamicArray.add(nums2[j]);
                map.put(nums2[j], 0);
            }
        }

        return dynamicArray.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        intersection obj = new intersection();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = obj.Intersection(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}