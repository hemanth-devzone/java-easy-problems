/*
Problem 91: Method for LCM
Description: Write a method to find the LCM of two numbers.
Input: 12 18
Output: 36
*/

import java.util.Scanner;

public class MethodForLCM1 {
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a, b));

        sc.close();
    }
}
