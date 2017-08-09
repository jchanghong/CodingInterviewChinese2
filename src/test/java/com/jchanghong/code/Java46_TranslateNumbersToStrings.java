/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题46：把数字翻译成字符串
 * // 题目：给定一个数字，我们按照如下规则把它翻译为字符串：0翻译成"a"，1翻
 * // 译成"b"，……，11翻译成"l"，……，25翻译成"z"。一个数字可能有多个翻译。例
 * // 如12258有5种不同的翻译，它们分别是"bccfi"、"bwfi"、"bczi"、"mcfi"和
 * // "mzi"。请编程实现一个函数用来计算一个数字有多少种不同的翻译方法。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

public class Java46_TranslateNumbersToStrings extends UtilAssert {
    int number(int number) {
        return 0;
    }

    @Test
    public void test() throws Exception {
        eq(number(12258), 5);
        eq(number(0), 1);
    }
}
