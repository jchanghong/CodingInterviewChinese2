/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题33：二叉搜索树的后序遍历序列
 * // 题目：输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * // 如果是则返回true，否则返回false。假设输入的数组的任意两个数字都互不相同。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import javax.lang.model.type.IntersectionType;
import java.util.Arrays;

public class Java33_SquenceOfBST extends UtilAssert {
    //左右中
    boolean aftersort(int[] ints) {
        return aftersort(ints, 0, ints.length - 1);
    }

    boolean aftersort(int[] ints, int start, int end) {
        if (start > end) {
            return false;
        }
        if (start == end) {
            return true;
        }
        if (end - start == 1) {
            return true;
        }
        int head = ints[end];
        int small = 0;
        for (int i=start;i<end+1;i++) {
            if (ints[i] < head) {
                small++;
            }
        }
        if (!good(ints, start + small, head,start,end)) {
            return false;
        }
        if (small == 0) {
            return aftersort(ints, start, end - 1);
        }
        else {
            return aftersort(ints, start, start + small-1) && aftersort(ints, start + small, end-1);
        }
    }

    //m之前的都比head小，其他的之后的都比head大
    boolean good(int[] ints, int m,int head,int s,int e) {
        for (int i=s;i<m&&i<=e;i++) {
            if (ints[i] > head) {
                return false;
            }
        }
        for (int i=m;i<=e;i++) {
            if (ints[i] < head) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test() throws Exception {
        int[] ints = {5, 7, 6, 9, 11, 10, 8};
        isTrue(aftersort(ints));
        ints = new int[]{7, 4, 6, 5};
        isFalse(aftersort(ints));

    }
}
