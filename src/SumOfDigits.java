/*
Problem 17: Sum of Digits
Description: Calculate sum of digits of a number.
Input: 123
Output: Sum: 6
*/

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum: " + sum);

        scanner.close();
    }
}