/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题65：不用加减乘除做加法
 * // 题目：写一个函数，求两个整数之和，要求在函数体内不得使用＋、－、×、÷
 * // 四则运算符号。
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

public class Java65_AddTwoNumbers {
    public int sum(int int1, int int2) {
        return int1+int2;
    }

    @Test
    public void test() throws Exception {
        Assert.assertEquals(sum(1, 2), 3);
        Assert.assertEquals(sum(1, 222), 223);
    }
}
