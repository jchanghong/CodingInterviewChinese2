/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题22：链表中倒数第k个结点
 * // 题目：输入一个链表，输出该链表中倒数第k个结点。为了符合大多数人的习惯，
 * // 本题从1开始计数，即链表的尾结点是倒数第1个结点。例如一个链表有6个结点，
 * // 从头结点开始它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个结点是
 * // 值为4的结点。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.LinkNode;
import com.jchanghong.code.util.LinkListUtil;
import org.junit.Assert;
import org.junit.Test;

public class Java22_KthNodeFromEnd {
    public LinkNode kthNode(LinkNode head, int k) {

        return null;
    }

    @Test
    public void test() throws Exception {
        LinkNode head = LinkListUtil.construct(1, 2, 3, 4);
        Assert.assertNull(kthNode(null,1));
        Assert.assertNull(kthNode(head, 5));
        Assert.assertEquals(kthNode(head, 3).values.intValue(), 2);
    }
}
