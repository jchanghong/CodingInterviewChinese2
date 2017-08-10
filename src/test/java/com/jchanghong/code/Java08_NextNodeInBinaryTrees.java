/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题8：二叉树的下一个结点
 * // 题目：给定一棵二叉树和其中的一个结点，如何找出中序遍历顺序的下一个结点？
 * // 树中的结点除了有两个分别指向左右子结点的指针以外，还有一个指向父结点的指针。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.TreeNodeParent;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

public class Java08_NextNodeInBinaryTrees {
    @Before
    public void setUp() throws Exception {
        deque.clear();
        next = null;
    }

    private Deque<TreeNodeParent> deque = new LinkedList<>();
    TreeNodeParent next;
    public TreeNodeParent getnext(TreeNodeParent head, TreeNodeParent node) {
        if (head == null) {
            return null;
        }
        getnext(head.left,node);
        if (deque.poll() == node) {
            next = head;
            return next;
        }
        deque.offer(head);
        getnext(head.right, node);
        return null;
    }

    private TreeNodeParent leftest(TreeNodeParent nodeParent) {
        TreeNodeParent parent = nodeParent;
        while (parent.left != null) {
            parent = parent.left;
        }
        return parent;
    }

    @Test
    public void test() throws Exception {
        Assert.assertEquals(getnext(null, null), null);
        TreeNodeParent head = new TreeNodeParent(null, 2, null, null);
        head.left = new TreeNodeParent(head, 1, null, null);
        head.right = new TreeNodeParent(head, 2, null, null);
        Assert.assertEquals(getnext(head, head.left), head);
    }
}
