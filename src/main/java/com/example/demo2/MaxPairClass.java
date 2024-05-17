package com.example.demo2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class MaxPairClass {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2, 3, 4, 5, 6, 7);
       // new MaxPairClass().getMAxPair(integers);
        new MaxPairClass().getaxOfSubList(integers);
    }


    private void getMAxPair(List<Integer> integers) {
        List<Integer> list = integers.stream().sorted().collect(Collectors.toList());
        System.out.println(list.get(list.size() - 1));
        System.out.println(list.get(list.size() - 2));
    }

   void getaxOfSubList(List<Integer> integers){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<integers.size();i++){
   Optional<Integer> optional=   integers.subList(0,i).stream().reduce((x, y)->x+y);
   int maximun = optional.isPresent()?optional.get():0;
         if( max< maximun){

             max=maximun;
         }
       }
       System.out.println("sum of max sublist " +max);

    }

}
