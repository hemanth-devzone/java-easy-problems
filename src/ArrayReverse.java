/*
Problem 28: Array Reverse
Description: Reverse elements of a 1D array.
Input: 1 2 3 4
Output: 4 3 2 1
*/
public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.print("Reversed: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
