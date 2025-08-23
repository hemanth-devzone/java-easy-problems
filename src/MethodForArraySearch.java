/*
Problem 100: Method for Array Search
Description: Write a method to search for an element in an array and return its index.
Input: Array: 5 2 8 1, Search: 8
Output: Index: 2
*/

import java.util.Scanner;

public class MethodForArraySearch {
    static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
        int key = sc.nextInt();
        int index = search(arr, key);
        System.out.println(index == -1 ? "Not Found" : "Index: " + index);

        sc.close();
    }
}
