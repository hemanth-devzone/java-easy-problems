/*
Problem 65: Simple Calculator
Description: Create a calculator for basic operations (+, -, *, /).
Input: 10 5 +
Output: Result: 15
*/

public class SimpleCalculator {
    static int calculate(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return b != 0 ? a / b : 0;
            default: return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Result: " + calculate(10, 5, '+'));
    }
}
