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
    //3, 4, 5, 1, 2}为{1, 2, 3, 4, 5}的一个旋转，该数组的最小值为1。
    public int min(int[] ints) {
        int start = 0;
        int end = ints.length-1;
        while (start <= end) {
            if (start == end) {
                return ints[start];
            }
            int m = (start + end) >> 2;

            if (ints[m] < ints[end]) {
                end = m-1;
            } else if (ints[m] >ints[start]) {
                start = m+1;
            } else return min2(ints);
        }
        return Integer.MIN_VALUE;
    }

    private int min2(int[] ints) {
        int min = Integer.MAX_VALUE;
        for (int anInt : ints) {
            if (anInt < min) {
                min = anInt;
            }
        }
        return min;
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
