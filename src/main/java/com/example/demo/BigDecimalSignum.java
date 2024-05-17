package com.example.demo;

import java.math.BigDecimal;

/**
 * @author shyam CH
 */
public class BigDecimalSignum {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(-1);
        BigDecimal bigDecimal1 = null;

       if(bigDecimal.signum()==1){
           System.out.println("bigdecimal valus is possitive");
       }
       else if(bigDecimal.signum()==-1){
           System.out.println("big decimal is negative");
       }
    }

}
