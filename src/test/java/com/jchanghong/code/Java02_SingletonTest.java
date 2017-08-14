/**

 */
package com.jchanghong.code;

public class Java02_SingletonTest {
    private static final Java02_SingletonTest SINGLETON = new Java02_SingletonTest();

    //不要用public
    private Java02_SingletonTest() {
    }

    public static Java02_SingletonTest getSingleton() {
        return
                SINGLETON;
    }

    //也可以用这个方法
    enum Sington {
        SINGTON
    }

}
