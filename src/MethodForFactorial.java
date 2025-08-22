/*
Problem 62: Method for Factorial
Description: Write a method to calculate factorial.
Input: 4
Output: 24
*/

public class MethodForFactorial {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
