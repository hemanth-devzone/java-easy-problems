/*
Problem 60: Method for Max
Description: Write a method to find maximum of three numbers.
Input: 4 7 2
Output: 7
*/

public class MethodForMax {
    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public static void main(String[] args) {
        System.out.println(max(4, 7, 2));
    }
}