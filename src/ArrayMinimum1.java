/*
Problem 53: Array Minimum
Description: Find minimum element in an array.
Input: 5 2 8 1 9
Output: Minimum: 1
*/
public class ArrayMinimum1 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        System.out.println("Minimum: " + min);
    }
}