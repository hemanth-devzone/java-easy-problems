/*
Problem 88: Method for Reverse Number
Description: Write a method to reverse a number.
Input: 1234
Output: 4321
*/

import java.util.Scanner;

public class MethodForReverseNumber {
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
        System.out.println(reverse(n));

        sc.close();
    }
}
