/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题56（一）：数组中只出现一次的两个数字
 * // 题目：一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序
 * // 找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.util.List;

public class Java56_01_NumbersAppearOnce extends UtilAssert {
    List<Integer> two(int[] ints) {
        return null;
    }

    @Test
    public void test() throws Exception {
        int[] ints = {1, 2, 3, 4, 2, 3};
        List<Integer> list = two(ints);
        eq(list.size(), 2);
        isTrue(list.contains(1));
        isTrue(list.contains(4));

    }
}
