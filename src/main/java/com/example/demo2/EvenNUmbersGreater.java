package com.example.demo2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author shyam CH
 */
public class EvenNUmbersGreater {
    public static void main(String[] args) {
        List list = Arrays.asList(3,4,5,6,8,10);
        //new EvenNUmbersGreater().listEven(list);
        List list2 = Arrays.asList(1,4,5,6,8,10);
        new EvenNUmbersGreater().mergeList(list,list2);
    }


    private void listEven(List<Integer> list){
        list.stream().filter(i->i%2==0).filter(x->x>5).collect(Collectors.toList()).forEach(System.out::println);

    }
    private void mergeList(List<Integer> l1,List<Integer> l2){
       Stream.concat(l1.stream(),l2.stream()).collect(Collectors.toSet()).
               forEach(System.out::println);
    }
}
