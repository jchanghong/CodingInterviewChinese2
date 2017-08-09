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
public class LinkListUtil {
    public static LinkNode construct(int... ints) {
        if (ints.length == 0) {
            return null;
        }
        LinkNode pre = null;
        LinkNode me = null;
        LinkNode head = new LinkNode(ints[0], null);
        pre = head;
        for (int i = 1; i < ints.length; i++) {
            me = new LinkNode(ints[i], null);
            pre.next = me;
            pre = me;
        }
        return head;
    }

    public static void printlinked(LinkNode head) {
        LinkNode node = head;
        while (node != null) {
            System.out.println(node.values);
            node = node.next;
        }
    }

    public static boolean equels(LinkNode head1, LinkNode head2) {
        if (head1 == null || head1 == null) {
            return head1 == head2;
        } else {
            LinkNode node1 = head1;
            LinkNode node2 = head2;
            while (node1 != null && node2 != null) {
                if (!node1.values.equals(node2.values)) {
                    return false;
                }
                node1 = node1.next;
                node2 = node2.next;
            }
            if (!Objects.equals(node1, node2)) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test() throws Exception {
        LinkNode head = construct(1, 2, 3, 4);
        printlinked(head);
    }

    @Test
    public void testequel() throws Exception {
        LinkNode head1 = construct(1, 2, 3, 4);
        LinkNode hea2 = construct(1, 2, 3, 4);
        printlinked(head1);
        Assert.assertEquals(equels(head1, hea2), true);
        Assert.assertEquals(equels(null, hea2), false);
        hea2 = construct(1, 3, 4);
        Assert.assertEquals(equels(head1, hea2), false);

    }
}
