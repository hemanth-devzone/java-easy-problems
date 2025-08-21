/*
Problem 35: Array Average
Description: Calculate average of array elements.
Input: 2 4 6 8
Output: Average: 5.0
*/
public class ArrayAverage {
    static double average(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        System.out.println("Average: " + average(arr));
    }
}
