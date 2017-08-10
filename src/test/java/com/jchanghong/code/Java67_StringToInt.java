/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题67：把字符串转换成整数
 * // 题目：请你写一个函数StrToInt，实现把字符串转换成整数这个功能。当然，不
 * // 能使用atoi或者其他类似的库函数。
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

public class Java67_StringToInt {
    public int str2Int(String string) {
        return 0;
    }

    @Test
    public void test() throws Exception {
        Assert.assertEquals(str2Int("2"), 2);
        Assert.assertEquals(str2Int("22"), 22);
        Assert.assertEquals(str2Int("-22"), -22);
        Assert.assertEquals(str2Int("44422"), 44422);
    }
}
