/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * // 作者：何海涛
 * //==================================================================
 * <p>
 * // 面试题58（一）：翻转单词顺序
 * // 题目：输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
 * // 为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，
 * // 则输出"student. a am I"。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

public class Java58_01_ReverseWordsInSentence extends UtilAssert{
    String reverseWord(String text) {
        return "";
    }

    @Test
    public void test() throws Exception {
        eq(reverseWord("I am a student. "), "student. a am I");
        eq(reverseWord("am"), "am");
    }
}
