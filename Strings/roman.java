//question13
import java.util.HashMap;
public class roman {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            if (i + 1 < s.length() && curr < map.get(s.charAt(i + 1))) {
                result -= curr;
            } else {
                result += curr;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        roman obj = new roman();
        String s = "MCMXCIV";
        int result = obj.romanToInt(s);
        System.out.println("Integer Value: " + result);
    }
}