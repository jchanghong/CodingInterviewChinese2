/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题54：二叉搜索树的第k个结点
 * // 题目：给定一棵二叉搜索树，请找出其中的第k大的结点。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.TreeNode;
import com.jchanghong.code.util.TreeUtil;
import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.util.Arrays;

public class Java54_KthNodeInBST extends UtilAssert {
    TreeNode kth(TreeNode head, int k) {
        int[] me = {0};
        return rec(head, me, k);
    }

    TreeNode rec(TreeNode head, int[] me,int k) {
        if (head == null ) {
            return null;
        }
        TreeNode left = rec(head.left, me, k);
        if (left != null) {
            return left;
        }
        me[0] = me[0]+1;
        if (me[0] == k) {
            return head;
        }
        left = rec(head.right, me, k);
        return left;
    }

    @Test
    public void test() throws Exception {
        TreeNode head = TreeUtil.construct(Arrays.asList(2, 1, 3));
        isTrue(kth(head, 1) == head.left);
        isTrue(kth(head, 2) == head);
        isTrue(kth(head, 3) == head.right);
    }
}
