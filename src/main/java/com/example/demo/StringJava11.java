package com.example.demo;

import java.util.Arrays;
import java.util.List;

/**
 * @author shyam CH
 */
public class StringJava11 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
      //  integerList.stream().forEach(System.out::println);
        integerList.stream().forEach((var e)->System.out.println(e));
        String  s = " Hai hello ";
        System.out.println(s.strip());
    }
}
