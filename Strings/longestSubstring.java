//question3
import java.util.HashMap;
public class longestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int length;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            map.put(s.charAt(right), right);
            length = right - left + 1;
            maxLength = Math.max(length, maxLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        longestSubstring sol = new longestSubstring();
        System.out.println(sol.lengthOfLongestSubstring("abcabcbb"));
    }
}