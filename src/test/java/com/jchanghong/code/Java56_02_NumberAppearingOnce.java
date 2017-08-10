/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题56（二）：数组中唯一只出现一次的数字
 * // 题目：在一个数组中除了一个数字只出现一次之外，其他数字都出现了三次。请
 * // 找出那个只出现一次的数字。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Java56_02_NumberAppearingOnce extends UtilAssert {

    public int once(int[] ints) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int anInt : ints) {

            if (map.containsKey(anInt)) {
                int v = map.get(anInt);
                map.put(anInt, v + 1);
            }
            else {
                map.put(anInt, 1);
            }
        }
        return map.entrySet().stream().filter(a -> a.getValue() == 1).findAny().get().getKey();
    }

    @Test
    public void test() throws Exception {
        int[] ints = {1, 2, 2, 2};
        eq(once(ints), 1);
    }
}
