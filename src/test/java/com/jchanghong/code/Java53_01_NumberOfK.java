/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题53（一）：数字在排序数组中出现的次数
 * // 题目：统计一个数字在排序数组中出现的次数。例如输入排序数组{1, 2, 3, 3,
 * // 3, 3, 4, 5}和数字3，由于3在这个数组中出现了4次，因此输出4。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

public class Java53_01_NumberOfK extends UtilAssert {
    int number(int[] ints, int number) {
        return 0;
    }

    @Test
    public void test() throws Exception {
        int[] ints = {1, 2, 3, 3, 3, 3, 4, 5};
        eq(number(ints, 3), 4);
    }
}
