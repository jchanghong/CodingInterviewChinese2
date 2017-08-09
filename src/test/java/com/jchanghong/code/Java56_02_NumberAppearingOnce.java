/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * // 作者：何海涛
 * //==================================================================
 * <p>
 * // 面试题56（二）：数组中唯一只出现一次的数字
 * // 题目：在一个数组中除了一个数字只出现一次之外，其他数字都出现了三次。请
 * // 找出那个只出现一次的数字。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

public class Java56_02_NumberAppearingOnce extends UtilAssert{

    public int once(int[] ints) {
        return -1;
    }

    @Test
    public void test() throws Exception {
        int[] ints = {1, 2, 2, 2};
       eq (once(ints), 1);
    }
}
