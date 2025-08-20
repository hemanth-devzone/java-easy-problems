/*
Problem 30: Array Search
Description: Search for an element in an array and return its index.
Input: Array: 5 2 8 1, Search: 8
Output: Index: 2
*/
public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1};
        int search = 8;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
