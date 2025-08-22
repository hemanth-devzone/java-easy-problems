/*
Problem 52: String First Non-Repeated
Description: Find first non-repeated character in a string.
Input: swiss
Output: w
*/
public class StringFirstNonRepeated {
    public static void main(String[] args) {
        String s = "swiss";
        for (char c : s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println(c);
                break;
            }
        }
    }
}