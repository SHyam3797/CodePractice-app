package com.example.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class DuplictaesFromList {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,1,3,4,5,6,7,3,89,7);
        new DuplictaesFromList().findDuplicate(integers);
    }

    private void findDuplicate(List<Integer> integerList){
        Set<Integer> uniqueList = new HashSet<>();
   List<Integer> dupList=     integerList.stream().filter(i->!uniqueList.add(i)).collect(Collectors.toList());
        dupList.forEach(System.out::println);
    }
}
