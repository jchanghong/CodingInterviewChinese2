/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题44：数字序列中某一位的数字
 * // 题目：数字以0123456789101112131415…的格式序列化到一个字符序列中。在这
 * // 个序列中，第5位（从0开始计数）是5，第13位是1，第19位是4，等等。请写一
 * // 个函数求任意位对应的数字。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

public class Java44_DigitsInSequence extends UtilAssert {

    int digit(int k) {
        return 0;
    }

    @Test
    public void test() throws Exception {
        //数字以0123456789101112131415
        eq(digit(5), 5);
        eq(digit(13), 1);
        eq(digit(19), 4);
    }
}
