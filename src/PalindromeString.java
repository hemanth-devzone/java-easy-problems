/*
Problem 25: Palindrome String
Description: Check if a string is a palindrome.
Input: radar
Output: Palindrome
*/
public class PalindromeString {
    public static void main(String[] args) {
        String str = "radar";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
