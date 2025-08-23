/*
Problem 92: Method for HCF
Description: Write a method to find the HCF (GCD) of two numbers.
Input: 12 18
Output: 6
*/

import java.util.Scanner;

public class MethodForHCF {
    static int hcf(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(hcf(a, b));
        sc.close();
    }
}
