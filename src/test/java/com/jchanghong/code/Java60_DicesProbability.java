/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题60：n个骰子的点数
 * // 题目：把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。输入n，打印出s
 * // 的所有可能的值出现的概率。
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class Java60_DicesProbability {
    // key is sum, v is pribity
    public Map<Integer, Double> pribility(int n) {
        return null;
    }

    @Test
    public void test() throws Exception {
        Map<Integer, Double> map = pribility(1);
        Assert.assertTrue(map.containsKey(6));
        Assert.assertTrue(map.get(6) == 1.0 / 6);
        map = pribility(2);
        Assert.assertTrue(map.containsKey(2));
        Assert.assertTrue(map.get(2) == 1.0 / 36);
    }
}
