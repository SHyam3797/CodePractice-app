package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class PaymentTest {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hai","hello","Hai","morning");
        new PaymentTest().uniqueLIst(strings);

    }


    private void uniqueLIst(List<String> stringList){
    List<String> uniqueList=    stringList.stream().distinct().collect(Collectors.toList());
    uniqueList.forEach(System.out::println);
    }
}
