/*
Problem 57: Array Rotate Left
Description: Rotate array elements left by one position.
Input: 1 2 3 4
Output: 2 3 4 1
*/

public class ArrayRotateLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        for (int n : arr) System.out.print(n + " ");
    }
}