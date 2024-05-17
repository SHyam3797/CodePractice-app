package com.example.demo.zemos;

import java.util.Arrays;
import java.util.List;

/**
 * @author shyam CH
 */
public class FindPair {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,4,5,6,7,8,9);
        new FindPair().findThePair(list,11);
    }



    private void findThePair(List<Integer> list, Integer value){
      for(int i =0;i<list.size()-1;i++){

            if(list.get(i)+list.get(i+1)==value){
                System.out.println("required pair"+list.get(i)+" "+list.get(i+1));
break;
        }

        }

    }
}
