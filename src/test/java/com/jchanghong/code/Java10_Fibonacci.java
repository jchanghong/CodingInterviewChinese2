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

import com.jchanghong.code.util.InputException;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/*
* 在数学上，费波那契数列是以递归的方法来定义：
F_{0}=0
F_{1}=1
F_{n}=F_{{n-1}}+F_{{n-2}}（n≧2）*/
public class Java10_Fibonacci {
    //f(n)=f(n-1)+f(n-2)
    public int get(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(2);
        if (n <=4) {
            return list.get(n-1);
        }
        for (int index = 4; index < n; index++) {
            list.add(list.get(index - 2) + list.get(index - 1));
        }
        return list.get(n - 1);
    }

    @Test
    public void time1() throws Exception {
        for (int i = 1; i < 35; i++) {
            get(i);
        }
    }

    @Test
    public void time2() throws Exception {
        for (int i = 1; i < 35; i++) {
            testfunction(i);
        }
    }

    @Test
    public void test() throws Exception {
        for (int i = 1; i < 35; i++) {
            Assert.assertEquals(get(i), testfunction(i));
        }
    }

    public int testfunction(int n) throws InputException {
        if (n < 1) {
            throw new InputException("n<1");
        }
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return testfunction(n - 2) + testfunction(n - 1);
        }
    }
}
