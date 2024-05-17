package com.example.demo2;

/**
 * @author shyam CH
 */
public class protectClass {
    protected int x,y;
}
class mainClass{
    public static void main(String[] args) {
        protectClass protectClass = new protectClass();
        System.out.println(protectClass.x);

    }


}
