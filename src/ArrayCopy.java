/*
Problem 75: Array Copy
Description: Copy elements of one array to another.
Input: 1 2 3
Output: Copied: 1 2 3
*/

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) arr2[i] = arr1[i];
        System.out.print("Copied: ");
        for (int n : arr2) System.out.print(n + " ");
    }
}
