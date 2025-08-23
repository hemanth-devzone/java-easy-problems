/*
Problem 90: Method for Count Digits
Description: Write a method to count digits in a number.
Input: 12345
Output: 5
*/

import java.util.Scanner;

public class MethodForCountDigits {
    static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));

        sc.close();
    }
}
