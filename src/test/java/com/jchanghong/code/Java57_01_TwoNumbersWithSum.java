/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题57（一）：和为s的两个数字
 * // 题目：输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们
 * // 的和正好是s。如果有多对数字的和等于s，输出任意一对即可。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Java57_01_TwoNumbersWithSum extends UtilAssert {
    public Pair function(int[] number, int sum) {
        int start = 0;
        int end = number.length - 1;
        while (start < end) {
            int i = number[start] + number[end];
            if (i == sum) {
                return new Pair(number[start], number[end]);
            } else if (i < sum) {
                end--;
            }
            else {
                start++;
            }
        }
        return null;
    }

    @Test
    public void test() throws Exception {
        int[] ints = {1, 2, 3, 4, 5, 6};
        Set<Pair> set = new HashSet<>();
        set.add(new Pair(1, 6));
        set.add(new Pair(2, 5));
        set.add(new Pair(3, 4));
        isTrue(set.contains(function(ints, 7)));
    }

    static class Pair {
        public int a = 0;
        public int b = 0;

        public Pair(int start, int end) {
            this.a = start;
            this.b = end;
        }

        @Override
        public String toString() {
            return a + "->" + b;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            } else if (obj instanceof Pair) {
                Pair o = (Pair) obj;
                return o.a == a && o.b == b;
            } else
                return false;
        }

        @Override
        public int hashCode() {
            return toString().hashCode();
        }
    }
}
