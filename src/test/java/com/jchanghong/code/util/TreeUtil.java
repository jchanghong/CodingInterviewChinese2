package com.jchanghong.code.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: jiang
 * \* Date: 2017/8/5 0005
 * \* Time: 18:06
 * \
 */
public class TreeUtil {

    public static boolean valuesEqual(TreeNode tree1, TreeNode tree2) {
        if (Objects.equals(tree1, tree2)) {
            return true;
        } else if (tree1 == null||tree2==null) {
            return false;
        } else if (tree1.values.equals(tree2.values)) {
            return valuesEqual(tree1.left, tree2.left) && valuesEqual(tree1.right, tree2.right);
        }
        return false;
    }

    @Test
    public void test() throws Exception {
        TreeNode h1 = new TreeNode(1, null, null);
        TreeNode h2 = new TreeNode(1, null, null);
        Assert.assertEquals(valuesEqual(h1, h2), true);
        h2.left = new TreeNode(2, null, null);
        Assert.assertEquals(valuesEqual(h1, h2), false);
        h1.left = new TreeNode(2, null, null);
        Assert.assertEquals(valuesEqual(h1, h2), true);
        Assert.assertEquals(valuesEqual(null,null),true);
    }
}
