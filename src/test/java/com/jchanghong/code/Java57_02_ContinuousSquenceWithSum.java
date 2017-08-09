/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * // 作者：何海涛
 * //==================================================================
 * <p>
 * // 面试题57（二）：为s的连续正数序列
 * // 题目：输入一个正数s，打印出所有和为s的连续正数序列（至少含有两个数）。
 * // 例如输入15，由于1+2+3+4+5=4+5+6=7+8=15，所以结果打印出3个连续序列1～5、
 * // 4～6和7～8。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Java57_02_ContinuousSquenceWithSum extends UtilAssert{
    public Set<Pair> function(int sum) {
        Set<Pair> pairs = new HashSet<>();
        return pairs;
    }
    static class Pair {
        public int start = 0;
        public int end = 0;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
        @Override
        public String toString() {
          return start + "->" + end;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
           else if (obj instanceof Pair) {
                Pair o = (Pair) obj;
                return o.start == start && o.end == end;
            }
            else
            return false;
        }

        @Override
        public int hashCode() {
            return toString().hashCode();
        }
    }

    @Test
    public void test() throws Exception {
        Set<Pair> pairs = function(15);
        eq(pairs.size(), 3);
        isTrue(pairs.contains(new Pair(1, 5)));
        isTrue(pairs.contains(new Pair(4, 6)));
        isTrue(pairs.contains(new Pair(7, 8)));
    }
}
