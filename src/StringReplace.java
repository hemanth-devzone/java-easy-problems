/*
Problem 51: String Replace
Description: Replace all occurrences of a character in a string.
Input: String: cat, Replace: a with o
Output: cot
*/
public class StringReplace {
    public static void main(String[] args) {
        String s = "cat";
        char oldChar = 'a';
        char newChar = 'o';
        String result = s.replace(oldChar, newChar);
        System.out.println(result);
    }
}