/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题28：对称的二叉树
 * // 题目：请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和
 * // 它的镜像一样，那么它是对称的。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.TreeNode;
import com.jchanghong.code.util.TreeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Java28_SymmetricalBinaryTree {
    public boolean isSym(TreeNode head) {
        TreeUtil.print2(head);

        Java27_MirrorOfBinaryTree tree = new Java27_MirrorOfBinaryTree();
        TreeNode h1 = tree.mirror(head);
        TreeUtil.print2(h1);
        boolean b = TreeUtil.valuesEqual(head, h1);
        return b;
    }

    @Test
    public void test() throws Exception {
        TreeNode head = TreeUtil.construct(Arrays.asList(1, 2, 2));
        TreeNode h1 = TreeUtil.construct(Arrays.asList(1, 3, 2));
        Assert.assertTrue(isSym(head));
        Assert.assertFalse(isSym(h1));

    }
}
