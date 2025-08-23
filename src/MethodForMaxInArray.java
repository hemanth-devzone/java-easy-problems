/*
Problem 96: Method for Max in Array
Description: Write a method to find the maximum element in an array.
Input: 1 5 3 9 2
Output: 9
*/

import java.util.Scanner;

public class MethodForMaxInArray {
    static int max(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) max = n;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
        System.out.println(max(arr));

        sc.close();
    }
}
