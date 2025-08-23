/*
Problem 82: Method for Fibonacci
Description: Write a method to print Fibonacci series up to N terms.
Input: 5
Output: 0 1 1 2 3
*/

import java.util.Scanner;

public class MethodForFibonacci {
    static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);

        sc.close();
    }
}
