/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * // 作者：何海涛
 * //==================================================================
 * <p>
 * // 面试题18（二）：删除链表中重复的结点
 * // 题目：在一个排序的链表中，如何删除重复的结点？例如，在图3.4（a）中重复
 * // 结点被删除之后，链表如图3.4（b）所示。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.LinkNode;
import com.jchanghong.code.util.LinkUtil;
import org.junit.Assert;
import org.junit.Test;

public class Java18_02_DeleteDuplicatedNode {

    public LinkNode removeDeplicated(LinkNode head) {
        return head;
    }

    @Test
    public void test() throws Exception {
        LinkNode linkNode = LinkUtil.construct(1, 2, 3, 4);
        Assert.assertTrue(LinkUtil.equels(linkNode, removeDeplicated(linkNode)));
       LinkNode linkNode2 = LinkUtil.construct(1, 2, 3, 4, 2);
        Assert.assertTrue(LinkUtil.equels(removeDeplicated(linkNode2), linkNode));
    }
}
