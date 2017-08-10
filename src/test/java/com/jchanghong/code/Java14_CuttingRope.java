/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题14：剪绳子
 * // 题目：给你一根长度为n绳子，请把绳子剪成m段（m、n都是整数，n>1并且m≥1）。
 * // 每段的绳子的长度记为k[0]、k[1]、……、k[m]。k[0]*k[1]*…*k[m]可能的最大乘
 * // 积是多少？例如当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此
 * // 时得到最大的乘积18。
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Java14_CuttingRope {
    //-1表示参数错误
    public int max(int n) {
        //0刀=n
        //1刀=max(i)*max(n-i)
        if (n < 1) {
            return -1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 3;
        }
        if (n == 4) {
            return 4;
        }
        int max = n;

        for (int i=1;i<n>>2+1;i++) {
            int n1 = max(i) * max(n - i);
            if (n1 > max) {
                max = n1;
            }
        }
        return max;
    }

    int max2(int n) {
        if (n < 1) {
            return -1;
        }
        //0刀=n
        //1刀=max(i)*max(n-i)
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int n1=5;n1<=n;n1++) {
            int max = n1;
            for (int i=1;i<n1>>2+1;i++) {
                int max1 = list.get(n1 - i) * list.get(i);
                if (max1 > max) {
                    max = max1;
                }
            }
            list.add(max);
        }
        return list.get(n);

    }

    @Test
    public void test() throws Exception {
        Assert.assertEquals(max(0), -1);
        Assert.assertEquals(max(-1), -1);
        Assert.assertEquals(max(8), 18);

    }
    @Test
    public void test2() throws Exception {
        Assert.assertEquals(max2(0), -1);
        Assert.assertEquals(max2(-1), -1);
        Assert.assertEquals(max2(8), 18);

    }
}
