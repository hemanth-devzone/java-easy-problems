/*
Problem 99: Method for Array Average
Description: Write a method to calculate average of array elements.
Input: 2 4 6 8
Output: 5.0
*/

import java.util.Scanner;

public class MethodForArrayAverage {
    static double average(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
        System.out.println(average(arr));

        sc.close();
    }
}
