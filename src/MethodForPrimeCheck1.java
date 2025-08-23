/*
Problem 83: Method for Prime Check
Description: Write a method to check if a number is prime.
Input: 7
Output: Prime
*/

import java.util.Scanner;

public class MethodForPrimeCheck1 {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n) ? "Prime" : "Not Prime");

        sc.close();
    }
}
