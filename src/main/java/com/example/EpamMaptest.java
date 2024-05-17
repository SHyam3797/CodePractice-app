package com.example;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author shyam CH
 */
public class EpamMaptest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hai", "hello","ahi","good","oodg");
        //System.out.println(list);
        new EpamMaptest().findMatching(list);
    }



    private void findMatching(List<String> list){
        Map<String,List<String>> sameContentMap= new HashMap<>();
        for (String s:list)
        {
           char[] ch = s.toCharArray();
       Arrays.sort(ch);
       String sortString = new String(ch);
       if(!sameContentMap.containsKey(sortString)){
           sameContentMap.put(sortString,new ArrayList<>());
       }

       sameContentMap.get(sortString).add(s);
        }
  sameContentMap.entrySet().stream().filter(s->s.getValue().size()>1).
          forEach(m->System.out.println(m.getValue()));

    }


}
