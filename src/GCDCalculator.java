/*
Problem 40: GCD Calculator
Description: Find GCD of two numbers using a loop.
Input: 12 18
Output: GCD: 6
*/
public class GCDCalculator {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println("GCD: " + gcd(a, b));
    }
}
