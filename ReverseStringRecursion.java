public class ReverseStringRecursive {

    public static String reverseString(String s) {
        // Base Case: If the string is empty or a single character
        if (s == null || s.length() <= 1) {
            return s;
        }

        // Recursive Case: Reverse the rest of the string + first character
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String text = "recursive";
        String reversed = reverseString(text);
        
        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed); // Output: evisrucer
    }
}