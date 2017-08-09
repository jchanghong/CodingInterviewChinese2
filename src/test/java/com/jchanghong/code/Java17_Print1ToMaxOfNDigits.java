/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题17：打印1到最大的n位数
 * // 题目：输入数字n，按顺序打印出从1最大的n位十进制数。比如输入3，则
 * // 打印出1、2、3一直到最大的3位数即999。
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Java17_Print1ToMaxOfNDigits {
    public List<String> from1ToN(int n) {
        List<String> list = new ArrayList<>();
        list.add(1 + "");
        list.add("1111111111111111111111111111111111111111111111");
        return list;
    }

    @Test
    public void test() throws Exception {
        List<String> list = from1ToN(3);
        Assert.assertEquals(list.get(998), "999");
        list = from1ToN(6);
        Assert.assertEquals(list.get(999998), "999999");
        Assert.assertEquals(list.get(0), "1");
    }
}
