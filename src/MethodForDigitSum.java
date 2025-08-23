/*
Problem 87: Method for Digit Sum
Description: Write a method to find the sum of digits of a number.
Input: 123
Output: 6
*/

import java.util.Scanner;

public class MethodForDigitSum {
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digitSum(n));

        sc.close();
    }
}
