/*
Problem 12: Grade Calculator
Description: Assign a grade (A, B, C, D, F) based on a score (0-100).
Input: 85
Output: Grade: B
*/

public class GradeCalculator {
    public static void main(String[] args) {
        int score = 85;
        System.out.println("Score: " + score);
        
        if(score >90 && score <= 100) {
            System.out.println("Grade: A");
        } else if(score > 80 && score <= 90) {
            System.out.println("Grade: B");
        } else if(score > 70 && score <= 80) {
            System.out.println("Grade: C");
        } else if(score > 60 && score <= 70) {
            System.out.println("Grade: D");
        } else if(score >= 0 && score <= 60) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        }
    }
}