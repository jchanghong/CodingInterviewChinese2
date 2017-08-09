/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题50（一）：字符串中第一个只出现一次的字符
 * // 题目：在字符串中找出第一个只出现一次的字符。如输入"abaccdeff"，则输出
 * // 'b'。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

public class Java50_01_FirstNotRepeatingChar extends UtilAssert {

    char first(String text) {
        return 'f';
    }

    @Test
    public void test() throws Exception {
        eq(first("abaccdeff"), 'b');
        eq(first("aabbvf"), 'v');
    }
}
