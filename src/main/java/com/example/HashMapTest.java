package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shyam CH
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","value1");
        map.put("a","value2");
        map.forEach((k,v)->System.out.println(k +":"+v));

    }
}
