package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

/**
 * @author shyam CH
 */
public class SingleTonJunit {

    @Test
      void singletonJunitTest(){
        System.out.println(SingletonTest.getInstance());
        System.out.println(SingletonTest.getInstance());
        System.out.println(SingletonTest.getInstance());
        assertEquals(SingletonTest.getInstance(),SingletonTest.getInstance());
    }
}
