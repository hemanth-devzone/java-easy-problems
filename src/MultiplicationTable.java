/*
Problem 20: Multiplication Table
Description: Print multiplication table of a number up to 10.
Input: 4
Output: 4 8 12 16 20 24 28 32 36 40
*/

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to print its multiplication table: ");
        int number = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.print(number * i + " ");
        }
        
        System.out.println();
        scanner.close();
    }
}