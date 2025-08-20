/*
Problem 26: Array Sum
Description: Calculate sum of elements in a 1D array.
Input: 1 2 3 4 5
Output: Sum: 15
*/
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
