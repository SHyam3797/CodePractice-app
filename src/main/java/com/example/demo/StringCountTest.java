package com.example.demo;

/**
 * @author shyam CH
 */
public class StringCountTest {
    public static void main(String[] args) {
        System.out.println(StringChallenge(new String[]{"ahffaksfajeeubsne","jefaa"}));
    }
    public static String StringChallenge(String[] strArr) {
        String N = strArr[0];
        String K = strArr[1];
        int[] charCount = new int[256];
        int uniqueChars = 0;
        for (char c : K.toCharArray()) {
            if (charCount[c] == 0) {
                uniqueChars++;
            }
            charCount[c]++;
        }
        int start = 0;
        int end = 0;
        int minStart = 0;
        int minLength = Integer.MAX_VALUE;
        while (end < N.length()) {
            char endChar = N.charAt(end);
            charCount[endChar]--;
            if (charCount[endChar] == 0) {
                uniqueChars--;
            }
            while (uniqueChars == 0) {
                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    minStart = start;
                }
                char startChar = N.charAt(start);
                charCount[startChar]++;
                if (charCount[startChar] > 0) {
                    uniqueChars++;
                }
                start++;
            }
            end++;
        }
    StringBuilder outPut=    new StringBuilder(N.substring(minStart, minStart + minLength)).reverse().append(":"+new StringBuffer("4rwclmz1d").reverse());
        return outPut.toString();
    }
}
