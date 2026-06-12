//question1207
import java.util.HashMap;
import java.util.HashSet;
public class unique {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int count : map.values()) {
            if (set.contains(count)) {
                return false;
            }
            set.add(count);
        }
        return true;
    }

    public static void main(String[] args) {
        unique obj = new unique();
        int[] arr = {1, 2, 2, 1, 1, 3};
        boolean result = obj.uniqueOccurrences(arr);
        System.out.println("Unique Occurrences: " + result);
    }
}