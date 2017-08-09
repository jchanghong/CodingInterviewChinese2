/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * // 作者：何海涛
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

public class Java54_KthNodeInBST extends UtilAssert{
    TreeNode kth(TreeNode head,int k) {
        return null;
    }

    @Test
    public void test() throws Exception {
        TreeNode head = TreeUtil.construct(Arrays.asList(2, 1, 3));
        isTrue(kth(head, 1) == head.left);
        isTrue(kth(head, 2) == head);
        isTrue(kth(head, 3)==head.right);
    }
}
