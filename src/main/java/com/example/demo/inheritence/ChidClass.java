package com.example.demo.inheritence;

/**
 * @author shyam CH
 */
public class ChidClass extends  ParentClass{
    public ChidClass() {
        System.out.println("child class");
    }

    private void parentMethod(){
        System.out.println("child");
    }
    void ch1(){
        System.out.println("im child");
    }
}
