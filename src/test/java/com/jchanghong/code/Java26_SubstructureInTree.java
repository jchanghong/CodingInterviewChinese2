/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
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
        if (head1 == null || head2 == null) {
            return false;
        }
        if (hasSubtree(head1, head2)) {
            return true;
        }
        else {
            return issubTree(head1.left, head2) || issubTree(head1.right, head2);
        }
    }

    public boolean hasSubtree(TreeNode me, TreeNode head2) {
        if (head2 == null) {
            return true;
        }
        if (me == null) {
            return false;
        }
        if (me.values.equals(head2.values)) {
            return hasSubtree(me.left, head2.left) && hasSubtree(me.right, head2.right);
        }
        else
        {
            return false;
        }
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
