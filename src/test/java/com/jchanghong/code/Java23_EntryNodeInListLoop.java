/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题23：链表中环的入口结点
 * // 题目：一个链表中包含环，如何找出环的入口结点？例如，在图3.8的链表中，
 * // 环的入口结点是结点3。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.LinkNode;
import com.jchanghong.code.util.LinkListUtil;
import org.junit.Assert;
import org.junit.Test;

public class Java23_EntryNodeInListLoop {
    public LinkNode entrynode(LinkNode head) {
        return null;
    }
    @Test
    public void test() throws Exception {
        LinkNode head = LinkListUtil.construct(1, 2, 3, 4);
        LinkNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = head.next;
        Assert.assertEquals(entrynode(head), head.next);
    }
}
