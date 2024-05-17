package com.example.demo2;

/**
 * @author shyam CH
 */
public class ContructorTest {

    void test1(){
        System.out.println("hai");
    }
    ContructorTest(ContructorTest c){
        System.out.println("test");
    }

    public static void main(String[] args) {
        ContructorTest contructorTest = new ContructorTest(null);
        contructorTest.test1();


    }
}
