/*
Problem 95: Method for Cube Root
Description: Write a method to find the cube root of a number.
Input: 27
Output: 3.0
*/

import java.util.Scanner;

public class MethodForCubeRoot {
    static double cubeRoot(double n) {
        return Math.cbrt(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println(cubeRoot(n));

        sc.close();
    }
}
