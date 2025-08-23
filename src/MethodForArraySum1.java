/*
Problem 98: Method for Array Sum
Description: Write a method to calculate sum of elements in an array.
Input: 1 2 3 4 5
Output: 15
*/

import java.util.Scanner;

public class MethodForArraySum1 {
    static int sum(int[] arr) {
        int s = 0;
        for (int n : arr) s += n;
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
        System.out.println(sum(arr));

        sc.close();
    }
}
