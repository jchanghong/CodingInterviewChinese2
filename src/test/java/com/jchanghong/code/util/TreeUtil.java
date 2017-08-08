package com.jchanghong.code.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

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


    /**
     * @param list 完全二叉树的层次遍历
     * @return
     */
    public static TreeNode construct(List<Integer> list) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode treeNode = new TreeNode(list.get(0), null, null);
        queue.offer(treeNode);
        int index = 1;

        while (queue.peek() != null && index < list.size()) {
            TreeNode node = queue.poll();
            node.left = new TreeNode(list.get(index++), null, null);
            queue.offer(node.left);
            if (index < list.size()) {
                node.right = new TreeNode(list.get(index++), null, null);
                queue.offer(node.right);
            }
        }
        return treeNode;

    }

    /**
     * @param head 层次遍历
     */
    public static void print(TreeNode head) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(head);
        TreeNode node;
        int linenumber = 1;
        int nextlinenumber = 0;
        while (queue.peek() != null) {
            node = queue.poll();
            System.out.print(node.values);
            linenumber--;
            if (node.left != null) {
                nextlinenumber++;
                queue.offer(node.left);
            }
            if (node.right != null) {
                nextlinenumber++;
                queue.offer(node.right);
            }
            if (linenumber == 0) {
                System.out.println("");
                linenumber = nextlinenumber;
                nextlinenumber = 0;
            }
        }
    }

    @Test
    public void testtree() throws Exception {
        TreeNode node = construct(Arrays.asList(1, 2, 3, 4, 5, 6,7,8));
        print(node);

    }
}
