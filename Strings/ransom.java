//question383
import java.util.HashMap;
public class ransom {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : magazine.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : ransomNote.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        ransom obj = new ransom();
        String ransomNote = "aa";
        String magazine = "aab";
        boolean result = obj.canConstruct(ransomNote, magazine);
        System.out.println("Can Construct: " + result);
    }
}