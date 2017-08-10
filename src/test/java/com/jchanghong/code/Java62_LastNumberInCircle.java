/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题62：圆圈中最后剩下的数字
 * // 题目：0, 1, …, n-1这n个数字排成一个圆圈，从数字0开始每次从这个圆圈里
 * // 删除第m个数字。求出这个圆圈里剩下的最后一个数字。
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

public class Java62_LastNumberInCircle {
    public int lastNumber(int[] ints,int m) {
        return -1;
    }

    @Test
    public void test() throws Exception {
        int[] ints = {0, 1, 2, 3, 4};
        Assert.assertEquals(lastNumber(ints,3), 3);
    }
}
