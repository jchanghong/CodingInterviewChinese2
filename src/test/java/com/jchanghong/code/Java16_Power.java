/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
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
        boolean f = false;
        if (exponent < 0) {
            f = true;
        }
        if (f) {
            double d = power1(base, -exponent);
            if (!equels(d,0.0)) {
                return 1 / d;
            }
            else {
                return d;
            }

        }
        else {
            return power1(base, exponent);
        }
    }

    //base不等于0，e大于0
    public double power1(double base, int e) {
        double bae = 1;
        for (int i=0;i<e;i++) {
            bae *= base;
        }
        return bae;
    }

    public boolean equels(double d1, double d2) {
        return Math.abs(d1 - d2) < 0.0000000000001;
    }

    @Test
    public void test() throws Exception {
        Assert.assertTrue(equels(Power(2.3, 4), Math.pow(2.3, 4)));
    }
}
