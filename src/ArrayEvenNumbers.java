/*
Problem 29: Array Even Numbers
Description: Print even numbers in an array.
Input: 1 4 6 3 8
Output: 4 6 8
*/
public class ArrayEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 8};
        System.out.print("Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
