/*
Problem 54: Array Second Largest
Description: Find second largest element in an array.
Input: 3 7 2 9 4
Output: Second Largest: 7
*/
public class ArraySecondLargest {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                second = n;
            }
        }
        System.out.println("Second Largest: " + second);
    }
}