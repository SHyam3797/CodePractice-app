package com.example.demo2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author shyam CH
 */
public class FindNonRepeatChar {
    public static void main(String[] args) {
        new FindNonRepeatChar().getChar("hai hello");
    }


    private void getChar(String str){
        str= str.replace(" ","");
   Optional c=     Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(x->x.getValue()==1).findFirst();

    }
}
