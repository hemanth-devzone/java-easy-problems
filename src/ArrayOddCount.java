/*
Problem 74: Array Odd Count
Description: Count odd numbers in an array.
Input: 1 2 3 4 5
Output: Odd Count: 3
*/

public class ArrayOddCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int count = 0;
        for (int n : arr) if (n % 2 != 0) count++;
        System.out.println("Odd Count: " + count);
    }
}
