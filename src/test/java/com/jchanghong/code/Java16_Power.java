/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * // 作者：何海涛
 * //==================================================================
 * <p>
 * // 面试题16：数值的整数次方
 * // 题目：实现函数double Power(double base, int exponent)，求base的exponent
 * // 次方。不得使用库函数，同时不需要考虑大数问题。
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

public class Java16_Power {

    public double Power(double base, int exponent) {
        return 0.0;
    }

    public boolean equels(double d1, double d2) {
        return Math.abs(d1 - d2) < 0.0000000000001;
    }
    @Test
    public void test() throws Exception {
        Assert.assertTrue(equels(Power(2.3, 4), Math.pow(2.3, 4)));
    }
}
