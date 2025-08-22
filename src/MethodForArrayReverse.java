/*
Problem 80: Method for Array Reverse
Description: Write a method to reverse an array.
Input: 1 2 3
Output: 3 2 1
*/

public class MethodForArrayReverse {
    static int[] reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] rev = reverse(arr);
        for (int n : rev) System.out.print(n + " ");
    }
}
