/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题38：字符串的排列
 * // 题目：输入一个字符串，打印出该字符串中字符的所有排列。例如输入字符串abc，
 * // 则打印出由字符a、b、c所能排列出来的所有字符串abc、acb、bac、bca、cab和cba。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Java38_StringPermutation extends UtilAssert {
    Set<String> allString(String text) {
        Set<String> strings = new HashSet<>();
        return strings;
    }

    @Test
    public void test() throws Exception {
        Set<String> strings = allString("abc");
        eq(strings.size(), 6);
        isTrue(strings.contains("acb"));

    }
}
