/*
Problem 94: Method for Square Root
Description: Write a method to find the square root of a number.
Input: 16
Output: 4.0
*/

import java.util.Scanner;

public class MethodForSquareRoot {
    static double squareRoot(double n) {
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println(squareRoot(n));

        sc.close();
    }
}
