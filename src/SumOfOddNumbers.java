/*
Problem 69: Sum of Odd Numbers
Description: Sum odd numbers up to N.
Input: 10
Output: Sum: 25
*/

public class SumOfOddNumbers {
    static int sumOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) sum += i;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum: " + sumOdd(10));
    }
}
