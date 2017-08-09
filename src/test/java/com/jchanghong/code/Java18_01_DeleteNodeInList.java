/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题18（一）：在O(1)时间删除链表结点
 * // 题目：给定单向链表的头指针和一个结点指针，定义一个函数在O(1)时间删除该
 * // 结点。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.LinkNode;
import org.junit.Assert;
import org.junit.Test;

public class Java18_01_DeleteNodeInList {

    public boolean removeMe(LinkNode head, LinkNode me) {
        return false;
    }
    @Test
    public void test() throws Exception {
        LinkNode head = new LinkNode(1, null);
        head.next = new LinkNode(2, null);
        head.next.next = new LinkNode(3, null);
        Assert.assertEquals(removeMe(head, null), false);
        Assert.assertEquals(removeMe(head, head.next), true);
        Assert.assertEquals(head.next.values.intValue(), 3);
    }
}
