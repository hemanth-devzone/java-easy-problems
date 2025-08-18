/*
Problem 14: Positive or Negative
Description: Check if a number is positive, negative, or zero.
Input: -5
Output: Negative
*/

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        scanner.close();
    }
}