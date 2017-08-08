/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * // 作者：何海涛
 * //==================================================================
 * <p>
 * // 面试题26：树的子结构
 * // 题目：输入两棵二叉树A和B，判断B是不是A的子结构。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class Java26_SubstructureInTree {
    public boolean issubTree(TreeNode head1, TreeNode head2) {
        return false;
    }

    @Test
    public void test() throws Exception {
        TreeNode head = new TreeNode(2, null, null);
        head.left = new TreeNode(1, null, null);
        head.right = new TreeNode(3, null, null);
        Assert.assertTrue(issubTree(head, head.left));
        Assert.assertTrue(issubTree(head, head.right));
    }
}
