/*

Problem 4: Area of a Circle

Description: Calculate the area of a circle given its radius.

Input: 4
Output: Area: 50.24
 */

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);

        scanner.close();

    }
}
