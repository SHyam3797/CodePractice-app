package com.example;

import java.util.Arrays;

/**
 * @author shyam CH
 */
public class EpamTest3 {
    public static void main(String[] args) {
       String[] str1 = new String[]{"str","hai","hello"};
       String[] str2 = new String[]{"hai","hello"};
       new EpamTest3().commonElemnets(str1,str2);
    }

    private void commonElemnets(String[] strs1,String[] strs2){
        int index =0;
String[] commonArray= new String[strs1.length];
            for(int i =0;i<strs1.length;i++){
                for (int j=0;j<strs2.length;j++){
                    if(strs1[i]==strs2[j]){
            commonArray[index++]=strs1[i];
            break;
                    }

            }
        }
            String[] finalResult = new String[index];
       //  System.arraycopy(commonArray, 0, finalResult, 0, index);
        //Arrays.stream(commonArray).forEach(System.out::println);
        for(int i =0;i<index;i++){
            finalResult[i]=commonArray[i];
        }
        Arrays.stream(finalResult).forEach(System.out::println);

    }
}
