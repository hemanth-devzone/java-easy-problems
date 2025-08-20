/*
Problem 11: Temperature Converter

Description: Convert Celsius to Fahrenheit.

Input: 25
Output: Fahrenheit: 77.0

 */

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 25;
        System.out.println("Celsius: " + celsius);

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Fahrenheit: " + fahrenheit);
    }    
}
