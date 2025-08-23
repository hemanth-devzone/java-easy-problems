/*
Problem 85: Method for Perfect Number
Description: Write a method to check if a number is a perfect number.
Input: 28
Output: Perfect
*/

import java.util.Scanner;

public class MethodForPerfectNumber {
    static boolean isPerfect(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n && n != 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPerfect(n) ? "Perfect" : "Not Perfect");

        sc.close();
    }
}
