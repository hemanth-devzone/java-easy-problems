/*
Problem 97: Method for Min in Array
Description: Write a method to find the minimum element in an array.
Input: 1 5 3 9 2
Output: 1
*/

import java.util.Scanner;

public class MethodForMinInArray {
    static int min(int[] arr) {
        int min = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
        System.out.println(min(arr));

        sc.close();
    }
}
