/*
Problem 36: Simple Interest
Description: Calculate simple interest (P*R*T/100).
Input: principal=1000 rate=5 time=2
Output: Interest: 100.0
*/
public class SimpleInterest {
    static double calculate(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        double p = 1000, r = 5, t = 2;
        System.out.println("Interest: " + calculate(p, r, t));
    }
}
