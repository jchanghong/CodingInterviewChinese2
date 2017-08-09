/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题58（二）：左旋转字符串
 * // 题目：字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * // 请定义一个函数实现字符串左旋转操作的功能。比如输入字符串"abcdefg"和数
 * // 字2，该函数将返回左旋转2位得到的结果"cdefgab"。
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

public class Java58_02_LeftRotateString {
    public String leftRotate(String text,int number) {
        return "";
    }

    @Test
    public void test() throws Exception {
        Assert.assertEquals(leftRotate("abcdefg",2),"cdefgab");
        Assert.assertEquals(leftRotate("abcdefg",1),"bcdefga");
    }
}
