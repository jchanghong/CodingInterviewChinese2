/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * // 作者：何海涛
 * //==================================================================
 * <p>
 * // 面试题42：连续子数组的最大和
 * // 题目：输入一个整型数组，数组里有正数也有负数。数组中一个或连续的多个整
 * // 数组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为O(n)。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

public class Java42_GreatestSumOfSubarrays extends UtilAssert{

    int max(int[] ints) {
        return 0;
    }

    @Test
    public void test() throws Exception {
        int[] ints = {1,- 2, 3, 10, -4, 7, 2, -5};
        eq(max(ints), 18);
    }
}
