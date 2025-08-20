/*
Problem 33: Array Minimum
Description: Find the minimum element in an array.
Input: 9 4 7 2 5
Output: Minimum: 2
*/
public class ArrayMinimum {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 2, 5};
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum: " + min);
    }
}
