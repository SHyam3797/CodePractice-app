package com.example.stringTest;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class FindOccurence {
    public static void main(String[] args) {
        String s= "hai hello hai";
        FindOccurence findOccurence = new FindOccurence();
        //findOccurence.findDuplicate(s);
        findOccurence.findOccurenceOFDuplicates(s);
       // findOccurence.occurence(s);

    }


    private void findDuplicate(String s){
        Set<String> stringSet = new HashSet<>();
      List<String> list = Arrays.stream(s.split(" ")).filter(x->!stringSet.add(x)).collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    private  void occurence(String s){
      Map<String,Long> map=  Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
   map.forEach((k,v)-> System.out.println(k+" "+v));
    }
    private void findOccurenceOFDuplicates(String s){
        Map<String,Long> map=  Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
   map.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);
        //System.out.println(list);

    }
}
