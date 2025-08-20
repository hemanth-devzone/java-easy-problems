/*
Problem 23: Vowel Counter
Description: Count vowels in a string.
Input: Hello
Output: Vowels: 2
*/
public class VowelCounter {
    public static void main(String[] args) {
        String str = "Hello";
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println("Vowels: " + count);
    }
}
