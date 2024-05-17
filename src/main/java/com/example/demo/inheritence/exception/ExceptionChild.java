package com.example.demo.inheritence.exception;

import java.io.IOException;

/**
 * @author shyam CH
 */
public class ExceptionChild extends  ExceptionParent{
    @Override
    void m1() throws IOException {
        System.out.println("im child");
    }
}
