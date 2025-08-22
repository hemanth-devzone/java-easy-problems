/*
Problem 63: Method for Prime Check
Description: Write a method to check if a number is prime.
Input: 13
Output: true
*/

public class MethodForPrimeCheck {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }
}
