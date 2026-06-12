public class PalindromeRec {
    public boolean isPalindrome(String s) {
        return check(s, 0, s.length() - 1);
    }

    private boolean check(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return check(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        PalindromeRec obj = new PalindromeRec();
        String s = "madam";
        System.out.println("Is Palindrome: " + obj.isPalindrome(s));
    }
}