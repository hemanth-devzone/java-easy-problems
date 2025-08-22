/*
Problem 58: Array Frequency
Description: Find frequency of each element in an array.
Input: 1 2 2 3
Output: 1:1, 2:2, 3:1
*/
import java.util.HashMap;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : arr) map.put(n, map.getOrDefault(n, 0) + 1);
        for (int key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}