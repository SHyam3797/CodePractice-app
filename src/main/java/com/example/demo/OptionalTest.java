package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class OptionalTest {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2,3,4,5,6,6);
        new OptionalTest().optionalTest(integers);
    }

    private void optionalTest(List<Integer> integers){
      List<Integer> list=  integers.stream().filter(i->i<1).collect(Collectors.toList());
    Optional optional=    Optional.of(list);
    optional.ifPresent(System.out::println);
    }
}
