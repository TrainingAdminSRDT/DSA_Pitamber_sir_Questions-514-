//question 242
import java.util.HashMap;

public class validAnagram {

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sets = new HashMap<>();
        HashMap<Character, Integer> sett = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sets.put(c, sets.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            sett.put(c, sett.getOrDefault(c, 0) + 1);
        }

        return sets.equals(sett);
    }

    public static void main(String[] args) {
        validAnagram obj = new validAnagram();

        String s = "anagram";
        String t = "nagaram";

        boolean result = obj.isAnagram(s, t);

        System.out.println("Is Anagram: " + result);
    }
}