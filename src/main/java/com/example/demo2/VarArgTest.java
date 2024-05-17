package com.example.demo2;

/**
 * @author shyam CH
 */
public class VarArgTest {
    void func(int... i){
        System.out.println("array printed"+i.length);
    }
    public static void main(String[] args) {
        VarArgTest varArgTest = new VarArgTest();
        varArgTest.func(2,3,4,5);

    }
}
