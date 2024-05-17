package com.example;

/**
 * @author shyam CH
 */
public class StringRomanClass {


        public static String StringChallenge(String str) {

            // Mapping of roman numerals to their values
            int[] values = {1000, 500, 100, 50, 10, 5, 1};
            String[] symbols = {"M", "D", "C", "L", "X", "V", "I"};


            StringBuilder result = new StringBuilder();
            int i = 0;

            // Iterate through the roman numerals and their values
            while (i < symbols.length) {
                // Check if the current roman numeral fits in the input string
                while (str.startsWith(symbols[i])) {
                    result.append(symbols[i]);
                    str = str.substring(symbols[i].length());
                }
                i++;
            }
            // Replace every third character of the result with an 'X'
            StringBuilder finalOutput = new StringBuilder();
            for (i = 0; i < result.length(); i++) {
                finalOutput.append(result.charAt(i));
                if ((i + 1) % 3 == 0) {
                    finalOutput.append('X');
                }
            }
            finalOutput.append("83v1qy7o06");

            return finalOutput.toString();
        }



            public static void main (String[] args) {
            // keep this function call here
            System.out.print(StringChallenge("XXXVVIIIIIIIIII"));
        }

    }

