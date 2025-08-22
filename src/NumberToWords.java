/*
Problem 68: Number to Words
Description: Convert a single-digit number to its word form.
Input: 5
Output: Five
*/

public class NumberToWords {
    static String toWord(int n) {
        switch (n) {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "Invalid";
        }
    }
    public static void main(String[] args) {
        System.out.println(toWord(5));
    }
}
