/*
Problem 56: Array Duplicate Count
Description: Count duplicate elements in an array.
Input: 1 2 2 3 1
Output: Duplicates: 2
*/

public class ArrayDuplicateCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1};
        int dupCount = 0;
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > 1) dupCount++;
        }
        System.out.println("Duplicates: " + dupCount);
    }
}