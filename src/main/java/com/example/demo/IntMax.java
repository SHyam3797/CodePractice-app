package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class IntMax{
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,4,3,6,7,9);
   Optional<Integer> integer=     integers.stream().max(Comparator.comparing(Integer->Integer));
        System.out.println(integer.isPresent()?integer.get():"notfound");
    }
}
