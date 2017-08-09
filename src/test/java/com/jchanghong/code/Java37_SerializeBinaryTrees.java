/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题37：序列化二叉树
 * // 题目：请实现两个函数，分别用来序列化和反序列化二叉树。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.TreeNode;
import com.jchanghong.code.util.TreeUtil;
import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.util.Arrays;

public class Java37_SerializeBinaryTrees extends UtilAssert {

    String serialize(TreeNode head) {
        return "";
    }

    TreeNode deSerize(String string) {
        return null;
    }

    @Test
    public void test() throws Exception {
        TreeNode head = TreeUtil.construct(Arrays.asList(1, 2, 3, 4, 5, 6));
        String s = serialize(head);
        TreeNode h2 = deSerize(s);
        isTrue(TreeUtil.valuesEqual(head, h2));
    }
}
