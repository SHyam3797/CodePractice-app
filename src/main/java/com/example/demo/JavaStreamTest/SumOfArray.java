package com.example.demo.JavaStreamTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class SumOfArray {
    public static void main(String[] args) {
        int[] ints = {1,3,4,5,6,7};
        SumOfArray sumOfArray = new SumOfArray();
        sumOfArray.sumOfArray(ints);
    }

    public  void sumOfArray(int[] arr){

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
       // Integer sum=list.stream().reduce((x,y)->x+y).get();
     int sum=   Arrays.stream(arr).sum();
        System.out.println("sum of ints "+sum);
    }
}
