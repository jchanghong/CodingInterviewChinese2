/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题5：替换空格
 * // 题目：请实现一个函数，把字符串中的每个空格替换成"%20"。例如输入“We are happy.”，
 * // 则输出“We%20are%20happy.”。
 */
package com.jchanghong.code;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Java05_ReplaceSpaces {

    public static String replace(String text) {
        return text.replace(" ", "%20");
    }

    @Test
    public void replace() throws Exception {
        String s1 = "i love you";
        String s2 = "i%20love%20you";
        assertEquals(Java05_ReplaceSpaces.replace(s1), s2);
        s1 = "  hello";
        s2 = "%20%20hello";
        assertEquals(Java05_ReplaceSpaces.replace(s1), s2);

    }
}
