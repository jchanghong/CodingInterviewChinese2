/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题48：最长不含重复字符的子字符串
 * // 题目：请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子
 * // 字符串的长度。假设字符串中只包含从'a'到'z'的字符。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

public class Java48_LongestSubstringWithoutDup extends UtilAssert {
    String sub(String text) {
        StringBuilder builder = new StringBuilder(text);
        int max = -1;
        String maxs = "";
        for (int i=0;i<builder.length();i++) {
            for (int j=i;j<builder.length();j++) {
                String s = builder.subSequence(i, j + 1).toString();
                if (good(s)) {
                    if (s.length() > max) {
                        max = s.length();
                        maxs = s;
                    }
                }
            }
        }
        return maxs;
    }

    boolean good(String text) {
        int[] ints = new int[256];
        for (int i=0;i<text.length();i++) {
            if (ints[text.charAt(i)] > 0) {
                return false;
            }
            ints[text.charAt(i)]++;
        }
        return true;
    }

    @Test
    public void goodtest() throws Exception {
        isTrue(good("abcdf"));
    }

    @Test
    public void test() throws Exception {
        eq(sub("abc"), "abc");
        eq(sub("abcbc"), "abc");
        eq(sub("aabcdff"), "abcdf");
    }
}
