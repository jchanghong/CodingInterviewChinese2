/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题43：从1到n整数中1出现的次数
 * // 题目：输入一个整数n，求从1到n这n个整数的十进制表示中1出现的次数。例如
 * // 输入12，从1到12这些整数中包含1 的数字有1，10，11和12，1一共出现了5次。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

public class Java43_NumberOf1 extends UtilAssert {
    int numberOf1(int n) {
        return 0;
    }

    @Test
    public void test() throws Exception {
        eq(numberOf1(12), 5);
        eq(numberOf1(10), 2);
    }
}
