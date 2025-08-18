/*
Problem 7: Relational Comparison

Description: Compare two numbers using relational operators and print results.

Input: 5 10
Output: 5 < 10: true, 5 > 10: false, 5 == 10: false

 */

import java.util.Scanner;

public class RelationalComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        boolean lessThan = num1 < num2;
        boolean greaterThan = num1 > num2;
        boolean equalTo = num1 == num2;
        
        System.out.println(num1 + " < " + num2 + ": " + lessThan);
        System.out.println(num1 + " > " + num2 + ": " + greaterThan);
        System.out.println(num1 + " == " + num2 + ": " + equalTo);
        
        
        scanner.close();
    }
}
