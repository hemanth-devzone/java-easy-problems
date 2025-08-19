/*
Problem 18: Reverse a Number
Description: Reverse a given integer.
Input: 1234
Output: 4321
*/

import java.util.Scanner;

class ReverseANumber {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer to reverse: ");
    int number = scanner.nextInt();
    int reversedNumber = 0;

    while (number != 0) {
        int digit = number % 10;
        reversedNumber = reversedNumber * 10 + digit; 
        number /= 10;
    }

    System.out.println("Reversed number: " + reversedNumber);

    scanner.close();
}
    
}