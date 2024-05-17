package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shyam CH
 */
public class StockProfit {
    public static void main(String[] args) {


        List<Integer> lists = Arrays.asList(10, 30, 1, 15, 25);


        new StockProfit().getProfit(lists);
    }


    private void getProfit(List<Integer> integers){
        int max=0;
      //  List<Integer> profitList = new ArrayList<>();
        int[] profitList = new int[2];
        for(int i = 0;i<integers.size();i++){

            for(int j=i+1;j< integers.size();j++){
                if(integers.get(j)- integers.get(i)>max){
                    max =integers.get(j)- integers.get(i);
                    profitList[0] =(integers.get(j));
                    profitList[1]=(integers.get(i));

                }
            }


        }
        Arrays.stream(profitList).forEach(System.out::println);

    }
}
