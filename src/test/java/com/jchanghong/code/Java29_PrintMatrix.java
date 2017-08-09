/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题29：顺时针打印矩阵
 * // 题目：输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

public class Java29_PrintMatrix extends UtilAssert{
    //元素之间没有任何其他符号
    String print(int[][] ints) {
        return "";
    }

    @Test
    public void test() throws Exception {
        int[][] ints = {
                {1, 2},
                {3, 4}
        };
        eq(print(ints), "1243");
    }
}
