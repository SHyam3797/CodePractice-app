package com.example.demo.JavaStreamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class MapStream {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,4,5,6,7,8,5,4);
        new MapStream().mapTest(integers);
    }

    private void mapTest(List<Integer> integerList){
        integerList.stream().map(i->i+i).collect(Collectors.toList()).forEach(System.out::println);

    }
}
