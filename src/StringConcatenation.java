/*
Problem 34: String Concatenation
Description: Concatenate two strings using a method.
Input: Hello World
Output: HelloWorld
*/
public class StringConcatenation {
    static String concat(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(concat(s1, s2));
    }
}
