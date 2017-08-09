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

        return -1;
    }

    @Test
    public void test() throws Exception {
        int[] ints = {9, 11, 8, 5, 7, 12, 16, 14};
        Assert.assertEquals(max(ints), 11);
    }
}
