/*
Problem 86: Method for Strong Number
Description: Write a method to check if a number is a strong number.
Input: 145
Output: Strong
*/

import java.util.Scanner;

public class MethodForStrongNumber {
    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += factorial(d);
            n /= 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isStrong(n) ? "Strong" : "Not Strong");

        sc.close();
    }
}
