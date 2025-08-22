/*
Problem 66: Quadratic Roots
Description: Find roots of a quadratic equation.
Input: a=1 b=-3 c=2
Output: Roots: 2.0, 1.0
*/

public class QuadraticRoots {
    public static void main(String[] args) {
        int a = 1, b = -3, c = 2;
        double d = b * b - 4 * a * c;
        if (d >= 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots: " + r1 + ", " + r2);
        } else {
            System.out.println("No real roots");
        }
    }
}
