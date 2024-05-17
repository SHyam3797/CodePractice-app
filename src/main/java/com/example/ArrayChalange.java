package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shyam CH
 */
public class ArrayChalange {

    private void arraChalnage(int[] arr){
        int k = arr[0];
        List<Integer> integers = new ArrayList<>();
        for (int value : arr) {
            integers.add(value);
        }
        integers.remove(0);
        int count=0;
        for(int i = 1 ;i<=k; i++){
            if( !integers.contains(i)&&!integers.contains(i+1) && !integers.contains(i+2)){
                count++;
            }

        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        //int[] arr = {6,4};
        int[] arr = {8,1,8};
        new ArrayChalange().arraChalnage(arr);

    }
}
