/*
Problem 5: Swap Two Numbers

Description: Swap two integers without using a temporary variable.

Input: a=10 b=20
Output: a=20 b=10
 */

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers to swap: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        scanner.close();
    }
}