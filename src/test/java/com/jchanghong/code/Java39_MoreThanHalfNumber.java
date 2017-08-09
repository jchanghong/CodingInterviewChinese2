/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题39：数组中出现次数超过一半的数字
 * // 题目：数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例
 * // 如输入一个长度为9的数组{1, 2, 3, 2, 2, 2, 5, 4, 2}。由于数字2在数组中
 * // 出现了5次，超过数组长度的一半，因此输出2。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

public class Java39_MoreThanHalfNumber extends UtilAssert {
    //-1表示错误
    int half(int[] ints) {
        return 0;
    }

    @Test
    public void test() throws Exception {
        eq(half(new int[]{1, 2, 3, 4}), -1);
        int[] ints = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        eq(half(ints), 2);
    }
}
