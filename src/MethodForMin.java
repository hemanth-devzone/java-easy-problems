/*
Problem 76: Method for Min
Description: Write a method to find minimum of three numbers.
Input: 4 2 7
Output: 2
*/

public class MethodForMin {
    static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    public static void main(String[] args) {
        System.out.println(min(4, 2, 7));
    }
}
