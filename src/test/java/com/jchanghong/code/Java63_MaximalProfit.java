/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题63：股票的最大利润
 * // 题目：假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖交易该股
 * // 票可能获得的利润是多少？例如一只股票在某些时间节点的价格为{9, 11, 8, 5,
 * // 7, 12, 16, 14}。如果我们能在价格为5的时候买入并在价格为16时卖出，则能
 * // 收获最大的利润11。
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

public class Java63_MaximalProfit {
    public int max(int[] ints) {
        return recMax(ints, 0, ints.length-1);
    }

    public int recMax(int[] ints, int start, int end) {
        if (start == end) {
            return ints[start];
        }
        if (end - start == 1) {
            return ints[end] - ints[start];
        }
        if (start > end) {
            return Integer.MIN_VALUE;
        }
        int m = (start + end) / 2;
        int maxm = recMax(ints, start, m);
        int max2 = recMax(ints, m+1, end);
        int max3 = max(ints, m+1, end) - min(ints, start, m);
        return maxof(maxm, max2, max3);
    }

    int min(int[] ints, int start, int end) {
        int min = Integer.MAX_VALUE;
        for (int i=start;i<=end;i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        return min;
    }
    int max(int[] ints, int start, int end) {
        int min = Integer.MIN_VALUE;
        for (int i=start;i<=end;i++) {
            if (ints[i] >min) {
                min = ints[i];
            }
        }
        return min;
    }

    int maxof(int... ints) {
        int min = Integer.MIN_VALUE;
        for (int anInt : ints) {
            if (anInt > min) {
                min = anInt;
            }
        }
        return min;
    }
    @Test
    public void test() throws Exception {
        int[] ints = {9, 11, 8, 5, 7, 12, 16, 14};
        Assert.assertEquals(max(ints), 11);
    }
}
