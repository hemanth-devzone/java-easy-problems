/*
Problem 55: Array Sort
Description: Sort an array in ascending order.
Input: 5 2 8 1 9
Output: 1 2 5 8 9
*/
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        Arrays.sort(arr);
        for (int n : arr) System.out.print(n + " ");
    }
}