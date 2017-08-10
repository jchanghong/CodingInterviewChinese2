/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题24：反转链表
 * // 题目：定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的
 * // 头结点。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.LinkListUtil;
import com.jchanghong.code.util.LinkNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

public class Java24_ReverseList {
    public LinkNode reverseList(LinkNode head) {
        Deque<LinkNode> nodes = new LinkedList<>();
        while (head != null) {
            nodes.addFirst(head);
            head = head.next;
        }
        LinkNode pre = new LinkNode(0, null);
        LinkNode stemp = pre;
        while (nodes.peekFirst() != null) {
            LinkNode next = nodes.pollFirst();
            next.next = null;
            pre.next = next;
            pre = pre.next;
        }
        return stemp.next;
    }
    @Test
    public void test() throws Exception {
        LinkNode head = LinkListUtil.construct(1, 2, 3, 4, 5, 6);
        LinkNode h2 = LinkListUtil.construct(6, 5, 4, 3, 2, 1);
        Assert.assertTrue(LinkListUtil.equels(reverseList(head), h2));
    }
}
