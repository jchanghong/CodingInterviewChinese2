/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题20：表示数值的字符串
 * // 题目：请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，
 * // 字符串“+100”、“5e2”、“-123”、“3.1416”及“-1E-16”都表示数值，但“12e”、
 * // “1e3.14”、“1.2.3”、“+-5”及“12e+5.4”都不是
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

public class Java20_NumericStrings {
    public boolean isNumber(String string) {
        return false;
    }

    @Test
    public void test() throws Exception {
        Assert.assertTrue(isNumber("+100"));
        Assert.assertTrue(isNumber("5e2"));
        Assert.assertTrue(isNumber("3.1233"));
        Assert.assertFalse(isNumber("12e"));
        Assert.assertFalse(isNumber("1la3.13"));
        Assert.assertFalse(isNumber("1.2.3"));
    }
}
