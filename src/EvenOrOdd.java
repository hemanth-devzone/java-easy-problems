/*
Problem 6: Even or Odd

Description: Check if a number is even or odd.

Input: 7
Output: Odd
 */


import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        scanner.close();
    }    
}
