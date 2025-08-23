/*
Problem 89: Method for Palindrome Number
Description: Write a method to check if a number is a palindrome.
Input: 121
Output: Palindrome
*/

import java.util.Scanner;

public class MethodForPalindromeNumber {
    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n) ? "Palindrome" : "Not Palindrome");

        sc.close();
    }
}
