public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        // Initialize two pointers
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            // Skip non-alphanumeric characters from left
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } 
            // Skip non-alphanumeric characters from right
            else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } 
            // Compare characters after converting to lowercase
            else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false; // Characters mismatch, not a palindrome
                }
                left++;
                right--;
            }
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";

        System.out.println("\"" + test1 + "\" is palindrome? " + isPalindrome(test1)); // True
        System.out.println("\"" + test2 + "\" is palindrome? " + isPalindrome(test2)); // False
    }
}
