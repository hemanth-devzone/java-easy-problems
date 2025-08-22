/*
Problem 48: Character Type
Description: Check if a character is a letter, digit, or special character.
Input: #
Output: Special Character
*/
public class CharacterType {
    static String type(char c) {
        if (Character.isLetter(c)) return "Letter";
        else if (Character.isDigit(c)) return "Digit";
        else return "Special Character";
    }
    public static void main(String[] args) {
        char c = '#';
        System.out.println(type(c));
    }
}
