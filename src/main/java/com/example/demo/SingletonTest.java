package com.example.demo;

/**
 * @author shyam CH
 */
public class SingletonTest {
    private static SingletonTest singletonTest;

    private SingletonTest() {
    }

    public static SingletonTest getInstance() {
        if (singletonTest == null) {
            synchronized (SingletonTest.class) {
                if (singletonTest == null) {
                    singletonTest = new SingletonTest();
                }
            }

        }
        return singletonTest;
    }
}