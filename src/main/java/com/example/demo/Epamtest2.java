package com.example.demo;

import org.apache.logging.log4j.util.Strings;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class Epamtest2 {

        public static void main(String[] args) {
            String arr[] = {"abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm"};
            Map<String, List<String>> map = new HashMap<>();

            for (String str : arr) {
                char[] charArray = str.toCharArray();
                Arrays.sort(charArray);
                String sortedString = new String(charArray);
                if (!map.containsKey(sortedString)) {
                    map.put(sortedString, new ArrayList<>());
                }
                map.get(sortedString).add(str);
            }

            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                List<String> list = entry.getValue();
                if (list.size() > 1) {
                    System.out.println("[" + String.join(", ", list) + "] contains same character");
                }
            }
        }
    }













