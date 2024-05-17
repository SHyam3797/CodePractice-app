package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class ListRemoveTest {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("hai","hello","good morning");
        List<String> l2 = Arrays.asList("hai","hello");
        new ListRemoveTest().removeCommon(l1,l2);
    }


    private void removeCommon(List<String> list1, List<String> list2){
       list1.stream().filter(l->!list2.contains(l)).collect(Collectors.toList()).forEach(System.out::println);
    }
}
