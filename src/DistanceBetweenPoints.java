/*
Problem 67: Distance Between Points
Description: Calculate distance between two points (x1,y1) and (x2,y2).
Input: x1=0 y1=0 x2=3 y2=4
Output: Distance: 5.0
*/

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        int x1 = 0, y1 = 0, x2 = 3, y2 = 4;
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance: " + dist);
    }
}
