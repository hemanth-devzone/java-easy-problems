/*
Problem 22: String Reversal
Description: Reverse a string without built-in methods.
Input: Java
Output: avaJ
*/
public class StringReversal {
    public static void main(String[] args) {
        String str = "Java";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
