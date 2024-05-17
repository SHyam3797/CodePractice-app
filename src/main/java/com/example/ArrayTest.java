package com.example;

import java.util.Arrays;

/**
 * @author shyam CH
 */
public class ArrayTest {
    public static void main(String[] args) {
        Integer[] integers = {0,1,0,0,1,1,0};
        new ArrayTest().arrayBinaryTest(integers);
    }

    private void arrayBinaryTest(Integer[] integers){
        Integer[] finalArray= new Integer[integers.length];
        Integer count = 0;
        for(int i=0;i<integers.length;i++){
if(integers[i]>0){
    integers[count++]=integers[i];
}

        }
        while(count< integers.length){
            integers[count++]=0;
        }

        Arrays.stream(integers).forEach(System.out::println);
    }
}
