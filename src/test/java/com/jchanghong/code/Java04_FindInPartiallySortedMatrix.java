/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * // 作者：何海涛
 * //==================================================================
 * <p>
 * // 面试题4：二维数组中的查找
 * // 题目：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按
 * // 照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个
 * // 整数，判断数组中是否含有该整数。
 */
package com.jchanghong.code;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Java04_FindInPartiallySortedMatrix {

    public static boolean find(int[][] array, int number) {

        return false;
    }

    @Test
    public void find() throws Exception {
        int[][] ints = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + "  ");
            }
            System.out.println("");
        }
        int number = 3;
        Java04_FindInPartiallySortedMatrix.find(ints, number);
        assertEquals(Java04_FindInPartiallySortedMatrix.find(ints, number), true);
        number = 10;
        assertEquals(Java04_FindInPartiallySortedMatrix.find(ints, number), false);
    }
}
