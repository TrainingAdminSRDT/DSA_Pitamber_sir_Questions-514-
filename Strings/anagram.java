//question49
import java.util.*;
public class anagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> sorted = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] current = strs[i].toCharArray();
            Arrays.sort(current);
            String key = new String(current);
            if (!sorted.containsKey(key)) {
                sorted.put(key, new ArrayList<>());
            }
            sorted.get(key).add(strs[i]);
        }
        return new ArrayList<>(sorted.values());
    }

    public static void main(String[] args) {
        anagram obj = new anagram();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = obj.groupAnagrams(strs);
        System.out.println(result);
    }
}