/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题50（二）：字符流中第一个只出现一次的字符
 * // 题目：请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从
 * // 字符流中只读出前两个字符"go"时，第一个只出现一次的字符是'g'。当从该字
 * // 符流中读出前六个字符"google"时，第一个只出现一次的字符是'l'。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

public class Java50_02_FirstCharacterInStream extends UtilAssert {

    char first(Reader reader, int readNumber) {
        return 1;
    }

    @Test
    public void test() throws Exception {
        Reader reader = new StringReader("google");
        eq(first(reader, 2), 'g');
        reader = new StringReader("google");
        eq(first(reader, 6), 'l');
    }
}
