/*
Problem 79: Method for Palindrome
Description: Write a method to check if a string is a palindrome.
Input: madam
Output: true
*/

public class MethodForPalindrome {
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }
}
