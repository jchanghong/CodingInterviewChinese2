/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题7：重建二叉树
 * // 题目：输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输
 * // 入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,
 * // 2, 4, 7, 3, 5, 6, 8}和中序遍历序列{4, 7, 2, 1, 5, 3, 8, 6}，则重建出
 * // 图2.6所示的二叉树并输出它的头结点。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.TreeNode;
import com.jchanghong.code.util.TreeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Java07_ConstructBinaryTree {
    public TreeNode construct(List<Integer> center, List<Integer> befor) {
        return null;
    }

    @Test
    public void test() throws Exception {
        List<Integer> center = Arrays.asList(2, 1, 3);
        List<Integer> befor = Arrays.asList(1, 2, 3);
        TreeNode head = new TreeNode(1, null, null);
        head.left = new TreeNode(2, null, null);
        head.right = new TreeNode(3, null, null);
        Assert.assertEquals(TreeUtil.valuesEqual(construct(center, befor), head), true);
    }
}
