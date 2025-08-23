/*
Problem 93: Method for Power
Description: Write a method to calculate a^b (power of a number).
Input: 2 5
Output: 32
*/

import java.util.Scanner;

public class MethodForPower {
    static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) result *= a;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a, b));

        sc.close();
    }
}
