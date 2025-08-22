/*
Problem 77: Method for GCD
Description: Write a method to find GCD of two numbers.
Input: 12 18
Output: 6
*/
public class MethodForGCD {
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(gcd(12, 18));
    }
}
