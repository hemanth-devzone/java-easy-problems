/*
Problem 33: Check Even Method
Description: Method to check if a number is even.
Input: 6
Output: true
*/
public class CheckEvenMethod {
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(isEven(num));
    }
}
