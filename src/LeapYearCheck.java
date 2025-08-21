/*
Problem 37: Leap Year Check
Description: Check if a year is a leap year.
Input: 2020
Output: Leap Year
*/
public class LeapYearCheck {
    static boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        int year = 2020;
        if (isLeap(year))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}
