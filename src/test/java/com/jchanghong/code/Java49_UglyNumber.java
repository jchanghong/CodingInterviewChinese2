/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题49：丑数
 * // 题目：我们把只包含因子2、3和5的数称作丑数（Ugly Number）。求按从小到
 * // 大的顺序的第1500个丑数。例如6、8都是丑数，但14不是，因为它包含因子7。
 * // 习惯上我们把1当做第一个丑数。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Java49_UglyNumber extends UtilAssert {
    boolean isUgly(int number) {
        while (number % 2 == 0) {
            number = number / 2;
        }
        while (number % 3 == 0) {
            number = number / 3;
        }
        while (number % 5 == 0) {
            number = number / 5;
        }
        return number == 1;
    }

    @Test
    public void testis() throws Exception {
        isTrue(isUgly(6));
        isTrue(isUgly(8));
        isFalse(isUgly(14));
    }

    int uglyNumber(int kth) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i=2;i<Integer.MAX_VALUE;i++) {
            if (isUgly(i)) {
                list.add(i);
                if (list.size() > kth + 1) {
                    break;
                }
            }
        }
        return list.get(kth);
    }

    @Test
    public void test() throws Exception {
        eq(uglyNumber(1), 1);
        eq(uglyNumber(2), 2);
        eq(uglyNumber(3), 3);
        eq(uglyNumber(4), 4);
        eq(uglyNumber(5), 5);
        eq(uglyNumber(6), 6);
        eq(uglyNumber(7), 8);
        eq(uglyNumber(8), 9);
    }
}
