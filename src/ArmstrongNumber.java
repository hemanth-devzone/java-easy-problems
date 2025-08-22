/*
Problem 44: Armstrong Number
Description: Check if a number is an Armstrong number.
Input: 153
Output: Armstrong Number
*/
public class ArmstrongNumber {
    static boolean isArmstrong(int num) {
        int temp = num, sum = 0, digits = String.valueOf(num).length();
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        int n = 153;
        if (isArmstrong(n)) System.out.println("Armstrong Number");
        else System.out.println("Not Armstrong");
    }
}
