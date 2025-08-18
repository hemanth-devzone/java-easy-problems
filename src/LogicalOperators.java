/*
Problem 8: Logical Operators
Description: Evaluate logical AND, OR, NOT for two boolean inputs.
Input: true false
Output: AND: false, OR: true, NOT true: false
*/
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean andResult = a && b;
        boolean orResult = a || b;
        boolean notAResult = !a;

        System.out.println("AND: " + andResult);
        System.out.println("OR: " + orResult);
        System.out.println("NOT " + a + ": " + notAResult);
    }
}