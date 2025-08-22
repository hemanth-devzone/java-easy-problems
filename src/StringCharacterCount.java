/*
Problem 50: String Character Count
Description: Count occurrences of a character in a string.
Input: String: hello, Char: l
Output: Count: 2
*/
public class StringCharacterCount {
    static int countChar(String s, char ch) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ch) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "hello";
        char ch = 'l';
        System.out.println("Count: " + countChar(s, ch));
    }
}
