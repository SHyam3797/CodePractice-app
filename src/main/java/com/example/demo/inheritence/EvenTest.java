package com.example.demo.inheritence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class EvenTest {


    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2,4,6);
        new EvenTest().evenElements(integers);
    }

    private Boolean evenElements(List<Integer> list){

      Integer size=  list.stream().filter(i->i%2!=0).collect(Collectors.toList()).size();
      return size>0;
    }
}
