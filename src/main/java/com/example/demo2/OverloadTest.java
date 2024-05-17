package com.example.demo2;

/**
 * @author shyam CH
 */
public class OverloadTest {

    public void m1(Integer x) throws Exception{
        System.out.println("m1");
    }

    public int m1(String x){
        System.out.println("m1");
        return 1;
    }
}
