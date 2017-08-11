/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题34：二叉树中和为某一值的路径
 * // 题目：输入一棵二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所
 * // 有路径。从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.TreeNode;
import com.jchanghong.code.util.TreeUtil;
import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.util.List;

public class Java34_PathInTree extends UtilAssert {
    /*
    如下的路径有“12”和“13”
    *       1

      2            3
    * */
    List<String> path(TreeNode head, int sum) {
        return null;
    }

    @Test
    public void test() throws Exception {
        TreeNode head = TreeUtil.construct2(10, 5, 12, 4, 7);
//        TreeUtil.print2(head);
        List<String> list = path(head, 22);
        eq(list.size(), 2);
        isTrue(list.contains("1012"));
        isTrue(list.contains("1057"));

    }
}
