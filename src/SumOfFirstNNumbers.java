/*
Problem 42: Sum of First N Numbers
Description: Calculate sum of first N natural numbers.
Input: 5
Output: Sum: 15
*/
public class SumOfFirstNNumbers {
    static int sum(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum: " + sum(n));
    }
}
