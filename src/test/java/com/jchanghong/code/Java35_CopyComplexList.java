/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题35：复杂链表的复制
 * // 题目：请实现函数ComplexListNode* Clone(ComplexListNode* pHead)，复
 * // 制一个复杂链表。在复杂链表中，每个结点除了有一个m_pNext指针指向下一个
 * // 结点外，还有一个m_pSibling 指向链表中的任意结点或者nullptr。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Java35_CopyComplexList extends UtilAssert {
    Node copy(Node head) {
        Map<Node, Node> old2new = new HashMap<>();
        return copy2(head, old2new);
    }
    Node copy2(Node head,Map<Node,Node> map) {
        if (head != null) {
        Node    head2 = new Node(head.v, null, null);
            head2.left = copy2(head.left, map);
            head2.other = copy2(head.other, map);
            return head2;
        }
        else {
            return null;
        }
    }

    @Test
    public void test() throws Exception {
        Node hed = new Node(1, null, null);
        hed.left = new Node(2, null, null);
        hed.left.left = new Node(3, null, null);
        hed.other = hed.left.left;
        Node copy = copy(hed);
        eq(copy.v, hed.v);
        eq(copy.other.v, hed.other.v);
    }

    static class Node {
        public int v;
        public Node left;
        public Node other;

        public Node(int v, Node left, Node other) {
            this.v = v;
            this.left = left;
            this.other = other;
        }
    }
}
