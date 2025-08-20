/*
Problem 19: Prime Number Check
Description: Check if a number is prime.
Input: 17
Output: Prime
 */

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check if it is prime: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Output: Prime");
        } else {
            System.out.println("Output: Not Prime");
        }
        scanner.close();
    }
}
