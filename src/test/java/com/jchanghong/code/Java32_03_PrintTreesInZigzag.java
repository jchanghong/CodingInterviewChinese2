/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题32（三）：之字形打印二叉树
 * // 题目：请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺
 * // 序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，
 * // 其他行以此类推。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.TreeNode;
import com.jchanghong.code.util.TreeUtil;
import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.util.List;

public class Java32_03_PrintTreesInZigzag extends UtilAssert{
    //一个元素代表一行，元素之间不加任何符号。
    List<String> print(TreeNode head) {
        return null;
    }

    @Test
    public void test() throws Exception {
        TreeNode head = TreeUtil.construct2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        List<String> list = print(head);
        eq(list.size(), 4);
        eq(list.get(0), "1");
        eq(list.get(1), "32");
        eq(list.get(2), "4567");
        eq(list.get(3), "15141312111098");
    }
}
