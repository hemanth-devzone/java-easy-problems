/*
Problem 45: Perfect Number
Description: Check if a number is a perfect number.
Input: 28
Output: Perfect Number
*/
public class PerfectNumber {
    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        int n = 28;
        if (isPerfect(n)) System.out.println("Perfect Number");
        else System.out.println("Not Perfect");
    }
}
