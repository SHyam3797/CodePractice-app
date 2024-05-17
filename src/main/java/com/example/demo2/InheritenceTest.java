package com.example.demo2;

import com.example.demo.inheritence.ChidClass;

/**
 * @author shyam CH
 */

class Base {
    void print() {
        System.out.println("Base");
    }
}
class childClass extends  Base{
    void print(){
        System.out.println("child");
    }
}

public class InheritenceTest {
    void doPrint(Base b){
        b.print();
    }

    public static void main(String[] args) {
        Base x= new Base();
        Base y = new childClass();
        childClass c= new childClass();
        InheritenceTest inheritenceTest = new InheritenceTest();
        inheritenceTest.doPrint(x);
        inheritenceTest.doPrint(y);
        inheritenceTest.doPrint(c);

    }
}
