// check if string is palindrome or not
import java.util.Scanner;
public class Stringpalindrome {
    public static boolean isPalindrome(String str, int left, int right){
        if(left >= right){
            return true; // Base case: If the left index is greater than or equal to the right index, it's a palindrome
        }
        if(str.charAt(left) != str.charAt(right)){
            return false; // If characters at left and right indices are not the same, it's not a palindrome
        }
        return isPalindrome(str, left + 1, right - 1); // Recursive case: Move towards the center
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean result = isPalindrome(str, 0, str.length() - 1);
        if(result){
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}