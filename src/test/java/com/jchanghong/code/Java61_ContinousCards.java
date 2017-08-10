/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题61：扑克牌的顺子
 * // 题目：从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。
 * // 2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王可以看成任意数字。
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Java61_ContinousCards {
    //0是王
    public boolean continous(int[] cards) {
         Arrays.sort(cards);
        int number0 = 0;
        for (int card : cards) {
            if (card == 0) {
                number0++;
            }
            else {
                break;
            }
        }
        int numberslip = 0;
        for (int i=number0+1;i<cards.length;i++) {
            numberslip += (cards[i] - cards[i-1]-1);
        }
        return number0 >= numberslip;
    }

    @Test
    public void test() throws Exception {

        int[] ints = {2, 3, 4, 5, 6};
        Assert.assertTrue(continous(ints));
        ints = new int[]{10, 11, 12, 13, 0};
        Assert.assertTrue(continous(ints));
        ints = new int[]{10, 11, 12, 0, 0};
        Assert.assertTrue(continous(ints));
        ints = new int[]{10, 11, 2, 0, 0};
        Assert.assertFalse(continous(ints));

    }
}
