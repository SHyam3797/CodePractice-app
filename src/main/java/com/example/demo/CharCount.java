package com.example.demo;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author shyam CH
 */
public class CharCount {
    public static void main(String[] args) {
        String s = "Hai hello word";
   String[] str=s.replace(" ","").
           split("");
           Map<String,Long> map= Stream.of(str).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    map.forEach((k,v)->System.out.println(k+" "+v));
    }
}
