/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题45：把数组排成最小的数
 * // 题目：输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼
 * // 接出的所有数字中最小的一个。例如输入数组{3, 32, 321}，则打印出这3个数
 * // 字能排成的最小数字321323。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

public class Java45_SortArrayForMinNumber extends UtilAssert {

    String min(int[] ints) {
        return "";
    }

    @Test
    public void test() throws Exception {
        int[] ints = {3, 32, 321};
        eq(min(ints), "321323");
    }
}
