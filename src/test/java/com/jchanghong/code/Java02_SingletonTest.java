/**

 */
package com.jchanghong.code;

import org.junit.Test;

public class Java02_SingletonTest {
    private static final Java02_SingletonTest SINGLETON = new Java02_SingletonTest();

    //test
    public Java02_SingletonTest() {
    }

    public static Java02_SingletonTest getSingleton() {
        return
                SINGLETON;
    }

    @Test
    public void main() throws Exception {
        Java02_SingletonTest java02_singleton = Java02_SingletonTest.getSingleton();
    }

    enum Sington {
        SINGTON
    }

}
