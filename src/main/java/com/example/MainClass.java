package com.example;// __define-ocg__

public class MainClass {
    public static void main(String[] args) {
        System.out.println(MathChallenge("56? * 106 = 5?678")); // Output: 8 0
    }

    public static String MathChallenge(String str) {
        int varOcg; // Variable named varOcg as per requirement

        // Remove leading and trailing whitespace
        str = str.trim();

        // Split the input string into three numbers and the operator
        String[] parts = str.split("[+\\-\\*=]");
        String num1 = parts[0].trim();
        String num2 = parts[1].trim();
        String num3 = parts[2].trim();
        char operator = str.charAt(num1.length() + num2.length() + 1); // Get the operator

        // Replace '?' characters with '0' to handle them as missing digits
        num1 = num1.replace('?', '0');
        num2 = num2.replace('?', '0');
        num3 = num3.replace('?', '0');

        // Determine the missing digits based on the positions of '?'
        int missingDigit1 = 0, missingDigit2 = 0;

        // If '?' exists in num1, calculate the first missing digit as the difference between num3 and num2
        if (num1.contains("?")) {
            missingDigit1 = Integer.parseInt(num3) - Integer.parseInt(num2);
        }

        // If '?' exists in num3, calculate the second missing digit as the difference between num3 and num1
        if (num3.contains("?")) {
            missingDigit2 = Integer.parseInt(num3) - Integer.parseInt(num1);
        }

        // Return the missing digits separated by a space
        return missingDigit1 + " " + missingDigit2;
    }
}
