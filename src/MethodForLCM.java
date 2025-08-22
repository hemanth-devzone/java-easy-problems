/*
Problem 78: Method for LCM
Description: Write a method to find LCM of two numbers.
Input: 4 6
Output: 12
*/

public class MethodForLCM {
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
        System.out.println(lcm(4, 6));
    }
}
