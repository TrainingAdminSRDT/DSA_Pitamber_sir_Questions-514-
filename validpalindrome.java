class Solution {

    public boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {

            if(s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) ||
                       isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        System.out.println(obj.validPalindrome("aba"));
        System.out.println(obj.validPalindrome("abca"));
        System.out.println(obj.validPalindrome("abc"));
    }
}