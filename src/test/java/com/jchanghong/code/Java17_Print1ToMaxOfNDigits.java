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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Java17_Print1ToMaxOfNDigits {
    public List<String> from1ToN(int n) {
        List<String> list = new ArrayList<>();
        BigInteger integer = BigInteger.valueOf(10);
        integer = integer.pow(n);
        BigInteger i = BigInteger.valueOf(1);
        BigInteger one = BigInteger.valueOf(1);
        BigInteger e = BigInteger.valueOf(0);
        for (;i.compareTo(integer)<0;i=i.add(one)) {
            list.add(i.toString());
        }
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
