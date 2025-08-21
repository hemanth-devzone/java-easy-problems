/*
Problem 32: Rectangle Area
Description: Calculate area of a rectangle using a method.
Input: length=5 width=3
Output: Area: 15
*/
public class RectangleArea {
    static int area(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        int l = 5, w = 3;
        System.out.println("Area: " + area(l, w));
    }
}

