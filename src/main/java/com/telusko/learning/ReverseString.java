package com.telusko.learning;

public class ReverseString {
    public static void main(String[] args) {
        // Input string (hardcoded)
        String input = "Hello World";

        // Method 1: Using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string (using StringBuilder): " + reversed);

        // Method 2: Using a loop
        String reversedLoop = reverseUsingLoop(input);
        System.out.println("Reversed string (using loop): " + reversedLoop);
    }

    // Method to reverse string using a loop
    public static String reverseUsingLoop(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
