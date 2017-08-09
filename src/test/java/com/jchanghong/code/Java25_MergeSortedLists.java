/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * // 作者：何海涛
 * //==================================================================
 * <p>
 * // 面试题25：合并两个排序的链表
 * // 题目：输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按
 * // 照递增排序的。例如输入图3.11中的链表1和链表2，则合并之后的升序链表如链
 * // 表3所示。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.LinkNode;
import com.jchanghong.code.util.LinkListUtil;
import org.junit.Assert;
import org.junit.Test;

public class Java25_MergeSortedLists {

    public LinkNode mergelist(LinkNode head1, LinkNode head2) {
        return null;
    }

    @Test
    public void test() throws Exception {
        LinkNode head1 = LinkListUtil.construct(1, 4, 6);
        LinkNode head2 = LinkListUtil.construct(2, 5, 7, 9, 100);
        LinkNode h3 = LinkListUtil.construct(1, 2, 4, 5, 6, 7, 9, 100);
        Assert.assertTrue(LinkListUtil.equels(h3, mergelist(head1, head2)));
    }
}
