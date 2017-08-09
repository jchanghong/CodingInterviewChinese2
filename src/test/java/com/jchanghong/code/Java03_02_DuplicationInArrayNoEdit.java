/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题3（二）：不修改数组找出重复的数字
 * // 题目：在一个长度为n+1的数组里的所有数字都在1到n的范围内，所以数组中至
 * // 少有一个数字是重复的。请找出数组中任意一个重复的数字，但不能修改输入的
 * // 数组。例如，如果输入长度为8的数组{2, 3, 5, 4, 3, 2, 6, 7}，那么对应的
 * // 输出是重复的数字2或者3。
 */
package com.jchanghong.code;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Java03_02_DuplicationInArrayNoEdit {
    public static int findduplication(int[] ints) {
        return 0;
    }

    @Test
    public void findduplication() throws Exception {
        int[] ints1 = new int[]{1, 2, 3, 4, 5, 2};
        assertEquals(2, Java03_01_DuplicationInArray.findDuplication(ints1));
        ints1 = new int[]{2, 3, 4, 5, 1, 1, 2, 1};
        List<Integer> list = Arrays.asList(2, 1);
        assertEquals(list.contains(Java03_01_DuplicationInArray.findDuplication(ints1)), true);
    }

}
