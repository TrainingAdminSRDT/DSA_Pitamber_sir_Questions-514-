//question58
public class wordLength {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else if (count > 0) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        wordLength obj = new wordLength();
        String s = "Hello World";
        int result = obj.lengthOfLastWord(s);
        System.out.println("Length of Last Word: " + result);
    }
}