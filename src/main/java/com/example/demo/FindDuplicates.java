package com.example.demo;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,3,2,3,4,4,5,67,78,8,8);
        new FindDuplicates().getDuplicateAndUnique(integers);

    }

    private void getDuplicateAndUnique(List<Integer> integerList){
        Set<Integer> uniqList= new HashSet<>();
       List<Integer> integers= integerList.stream().filter(i->!uniqList.add(i)).collect(Collectors.toList());
        System.out.println("duplicate elements");
      //  integerList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
      integers.forEach(System.out::println);
        System.out.println("unique elements");
        uniqList.forEach(System.out::println);
    }
}
