/*
Problem 84: Method for Armstrong Check
Description: Write a method to check if a number is an Armstrong number.
Input: 153
Output: Armstrong
*/

import java.util.Scanner;

public class MethodForArmstrongCheck {
    static boolean isArmstrong(int n) {
        int temp = n, sum = 0, digits = String.valueOf(n).length();
        while (n > 0) {
            int d = n % 10;
            sum += Math.pow(d, digits);
            n /= 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n) ? "Armstrong" : "Not Armstrong");

        sc.close();
    }
}
