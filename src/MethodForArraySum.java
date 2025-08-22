/*
Problem 64: Method for Array Sum
Description: Write a method to sum array elements.
Input: 1 2 3
Output: 6
*/

public class MethodForArraySum {
    static int sum(int[] arr) {
        int total = 0;
        for (int n : arr) total += n;
        return total;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(sum(arr));
    }
}
