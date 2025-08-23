/*
Problem 81: Method for Factorial
Description: Write a method to calculate factorial of a number.
Input: 5
Output: 120
*/

import java.util.Scanner;

public class MethodForFactorial1 {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));

        sc.close();
    }
}
