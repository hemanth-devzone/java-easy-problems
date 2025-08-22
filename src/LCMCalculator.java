/*
Problem 41: LCM Calculator
Description: Find LCM of two numbers using GCD.
Input: 4 6
Output: LCM: 12
*/

public class LCMCalculator {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        int a = 4, b = 6;
        System.out.println("LCM: " + lcm(a, b));
    }
}
