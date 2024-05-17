package com.example.demo;

/**
 * @author shyam CH
 */
public class StringPoolTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        s1=s2;
        System.out.println(s1);
    }
}
