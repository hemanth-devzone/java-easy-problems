/*
Problem 10: Decrement Operator

Description: Use – operator to decrement a number 3 times.

Input: 8
Output: 5

 */

public class DecrementOperator {
    public static void main(String[] args) {
        int number = 8;
        System.out.println("Initial number: " + number);

        number--; // First decrement
        number--; // Second decrement
        number--; // Third decrement

        System.out.println("Number after decrementing 3 times: " + number);
    }
}
