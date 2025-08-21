/*
Problem 39: Power of Number
Description: Calculate power of a number using a loop.
Input: base=2 power=3
Output: 8
*/
public class PowerOfNumber {
    static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        int base = 2, exp = 3;
        System.out.println(power(base, exp));
    }
}
