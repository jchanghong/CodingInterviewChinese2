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
import com.sun.corba.se.spi.ior.EncapsulationFactoryBase;
import org.junit.Assert;
import org.junit.Test;

import java.security.spec.EncodedKeySpec;
import java.util.Arrays;
import java.util.List;

public class Java07_ConstructBinaryTree {
    public TreeNode construct(List<Integer> center, List<Integer> befor) {
        return construct2(center, 0, center.size() - 1, befor, 0, befor.size() - 1);
    }

    public TreeNode construct2(List<Integer> center, int startc, int entc, List<Integer> befor, int startb, int endb) {
        if (startb < 0 || startc < 0 || entc >= center.size() || endb >= center.size()) {
            return null;
        }
        if (startb == endb) {
            return new TreeNode(befor.get(startb), null, null);
        }
        if (startb <endb) {
            TreeNode head = new TreeNode(befor.get(startb), null, null);
            int indexhead = center.indexOf(befor.get(startb));
            head.left = construct2(center, startc, indexhead - 1, befor, startb + 1, indexhead - startc + startb);
            head.right = construct2(center, indexhead + 1, entc, befor, endb - (entc - 1 - indexhead), endb);
            return head;
        }
        return null;
    }

    @Test
    public void test() throws Exception {
        List<Integer> center = Arrays.asList(2, 1, 3);
        List<Integer> befor = Arrays.asList(1, 2, 3);
        TreeNode head = new TreeNode(1, null, null);
        head.left = new TreeNode(2, null, null);
        head.right = new TreeNode(3, null, null);
        TreeNode construct = construct(center, befor);
        TreeUtil.print2(construct);

        Assert.assertEquals(TreeUtil.valuesEqual(construct, head), true);
    }
}
