/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * // 作者：何海涛
 * //==================================================================
 * <p>
 * // 面试题48：最长不含重复字符的子字符串
 * // 题目：请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子
 * // 字符串的长度。假设字符串中只包含从'a'到'z'的字符。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

public class Java48_LongestSubstringWithoutDup extends UtilAssert{
    String sub(String text) {
        return text;
    }

    @Test
    public void test() throws Exception {
        eq(sub("abc"), "abc");
        eq(sub("abcbc"), "abc");
        eq("aabcdff", "abcdf");
    }
}
