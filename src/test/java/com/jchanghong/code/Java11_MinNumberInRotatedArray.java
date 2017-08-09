/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题11：旋转数组的最小数字
 * // 题目：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * // 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如数组
 * // {3, 4, 5, 1, 2}为{1, 2, 3, 4, 5}的一个旋转，该数组的最小值为1。
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

public class Java11_MinNumberInRotatedArray {
    public int min(int[] ints) {
        return Integer.MIN_VALUE;
    }

    @Test
    public void test() throws Exception {
        int[] ints = new int[]{3, 4, 5, 1, 2};
        Assert.assertEquals(min(ints), 1);
        ints = new int[]{
                3, 4, 5, 0, 1, 2};
        Assert.assertEquals(min(ints), 0);
    }
}
