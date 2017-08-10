/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题19：正则表达式匹配
 * // 题目：请实现一个函数用来匹配包含'.'和'*'的正则表达式。模式中的字符'.'
 * // 表示任意一个字符，而'*'表示它前面的字符可以出现任意次（含0次）。在本题
 * // 中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"
 * // 和"ab*ac*a"匹配，但与"aa.a"及"ab*a"均不匹配。
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java19_RegularExpressionsMatching {
    public boolean match(String text, String reg) {

        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    @Test
    public void test() throws Exception {
        Assert.assertTrue(match("aaa", "a.a"));
        Assert.assertTrue(match("aaa", "ab*ac*a"));
        Assert.assertFalse(match("aaa", "aa.a"));
        Assert.assertFalse(match("aaa", "ab*a"));
    }
}
