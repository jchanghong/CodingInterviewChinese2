/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题10：斐波那契数列
 * // 题目：写一个函数，输入n，求斐波那契（Fibonacci）数列的第n项。
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

/*
* 在数学上，费波那契数列是以递归的方法来定义：
F_{0}=0
F_{1}=1
F_{n}=F_{{n-1}}+F_{{n-2}}（n≧2）*/
public class Java10_Fibonacci {
    public int get(int n) {
        return 0;
    }

    @Test
    public void test() throws Exception {
        for (int i=1;i<100;i++) {
            Assert.assertEquals(get(i),testfunction(i));
        }
    }

    public int testfunction(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else   {
            return testfunction(n - 2) + testfunction(n - 1);
        }
    }
}
