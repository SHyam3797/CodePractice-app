package com.example.demo;

import org.apache.el.parser.ELParserConstants;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class IntStremTest {

    public static void main(String[] args) {
        String s="hello word hello city";
        new IntStremTest().wordCount(s.split(" "));
    }
    private void wordCount(String[] strings){
     Map<String,Long> map=   Arrays.stream(strings).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

   map.forEach((k,v)-> System.out.println(k+" "+v));
    }

}
