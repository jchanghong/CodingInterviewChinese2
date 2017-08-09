/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题59（二）：队列的最大值
 * // 题目：给定一个数组和滑动窗口的大小，请找出所有滑动窗口里的最大值。例如，
 * // 如果输入数组{2, 3, 4, 2, 6, 2, 5, 1}及滑动窗口的大小3，那么一共存在6个
 * // 滑动窗口，它们的最大值分别为{4, 4, 6, 6, 6, 5}，
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Java59_02_QueueWithMax {
    public int[] maxs(int[] number, int size) {
        return number;
    }

    @Test
    public void test() throws Exception {
        int[] ints = {2, 3, 4, 2, 6, 2, 5, 1};
        int size = 3;
        Assert.assertTrue(Arrays.equals(maxs(ints, size), new int[]{4, 4, 6, 6, 6, 5}));
    }
}
