package com.example.demo.inheritence;

import java.util.*;

/**
 * @author shyam CH
 */
public class StringSort {


    public static void main(String... args) {
        List<String> list = Arrays.asList("haiheloolargeString","lisy","hello","bigstring");
        new StringSort().StringSort(list);
        int i = 9;
       // Map<Integer, int>
      //  Integer k = new Integer(09);
        Map<StringBuilder,String> map = new HashMap<>();
        StringBuilder str = new StringBuilder("key");
        map.put(str,"value");
       str= str.append("_mod");
        System.out.println(map.get(str));


    }
    private void StringSort(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

    }
}
