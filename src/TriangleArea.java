/*
Problem 38: Triangle Area
Description: Calculate area of a triangle (0.5*base*height).
Input: base=4 height=5
Output: Area: 10.0
*/
public class TriangleArea {
    static double area(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        double base = 4, height = 5;
        System.out.println("Area: " + area(base, height));
    }
}
