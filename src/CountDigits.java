/*
Problem 43: Count Digits
Description: Count number of digits in an integer.
Input: 12345
Output: Digits: 5
*/
public class CountDigits {
    static int count(int num) {
        int c = 0;
        while (num > 0) {
            c++;
            num /= 10;
        }
        return c;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Digits: " + count(n));
    }
}
