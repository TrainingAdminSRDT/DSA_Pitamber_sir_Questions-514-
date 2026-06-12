// question125
public class validPalindrome {

    public boolean isPalindrome(String s) {
        return check(s, 0, s.length() - 1);
    }

    private boolean check(String s, int left, int right) {
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }

        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }

        if (left >= right) {
            return true;
        }

        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            return false;
        }

        return check(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        validPalindrome obj = new validPalindrome();

        String s = "A man, a plan, a canal: Panama";

        boolean result = obj.isPalindrome(s);

        System.out.println("Is Palindrome: " + result);
    }
}