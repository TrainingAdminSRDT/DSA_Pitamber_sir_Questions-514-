//question771
import java.util.HashSet;
public class jewels {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for (char ch : jewels.toCharArray()) {
            set.add(ch);
        }
        int count = 0;
        for (char ch : stones.toCharArray()) {
            if (set.contains(ch)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        jewels obj = new jewels();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int result = obj.numJewelsInStones(jewels, stones);
        System.out.println("Number of Jewels: " + result);
    }
}