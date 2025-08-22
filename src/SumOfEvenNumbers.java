/*
Problem 70: Sum of Even Numbers
Description: Sum even numbers up to N.
Input: 10
Output: Sum: 30
*/

public class SumOfEvenNumbers {
    static int sumEven(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) sum += i;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum: " + sumEven(10));
    }
}
