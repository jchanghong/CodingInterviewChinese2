/**

 */
package com.jchanghong.code;

public class Java02_SingletonTest {
    private static final Java02_SingletonTest SINGLETON = new Java02_SingletonTest();

    //test
    public Java02_SingletonTest() {
    }

    public static Java02_SingletonTest getSingleton() {
        return
                SINGLETON;
    }


    enum Sington {
        SINGTON
    }

}
