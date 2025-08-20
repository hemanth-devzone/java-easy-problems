/*
Problem 9: Increment Operator
Description: Use ++ operator to increment a number 5 times in a loop.
Input: 10
Output: 15
*/
public class IncrementOperator {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 0; i < 5; i++) {
            number++;
        }
        System.out.println(number);
    }
}