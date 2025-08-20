/*
Problem 27: Array Maximum
Description: Find maximum element in an array.
Input: 3 7 2 9 4
Output: Maximum: 9
*/
public class ArrayMaximum {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum: " + max);
    }
}
