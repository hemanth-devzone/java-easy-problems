/*
Problem 15: Factorial Calculator
Description: Calculate factorial of a number using a for loop.
Input: 5
Output: Factorial: 120
*/

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);

        scanner.close();
    }
}