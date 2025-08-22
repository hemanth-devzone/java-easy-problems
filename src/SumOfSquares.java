/*
Problem 46: Sum of Squares
Description: Calculate sum of squares of first N numbers.
Input: 3
Output: Sum: 14
*/
public class SumOfSquares {
    static int sumSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Sum: " + sumSquares(n));
    }
}
