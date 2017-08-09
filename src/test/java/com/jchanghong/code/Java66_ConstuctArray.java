/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题66：构建乘积数组
 * // 题目：给定一个数组A[0, 1, …, n-1]，请构建一个数组B[0, 1, …, n-1]，其
 * // 中B中的元素B[i] =A[0]×A[1]×… ×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Java66_ConstuctArray {
    public int[] constrct(int[] a) {
        return null;
    }

    @Test
    public void test() throws Exception {
        int[] ints = {1, 2, 3};
        Assert.assertTrue(Arrays.equals(ints,new int[]{1,2,3}));
        ints = new int[]{1, 2, 3, 4, 5, 6, 6, 7, 7};
        Assert.assertTrue(Arrays.equals(function1(ints), constrct(ints)));
        ints = new int[]{1, 2, 0};
        Assert.assertTrue(Arrays.equals(new int[]{0,0,2}, constrct(ints)));
    }

    private int[] function1(int[] a) {
        int sun = 1;
        for (int i : a) {
            sun *= i;
        }
        int[] b = new int[a.length];
        for (int i=0;i<b.length;i++) {
                b[i] = sun / a[i];
        }
        return b;
    }
}
