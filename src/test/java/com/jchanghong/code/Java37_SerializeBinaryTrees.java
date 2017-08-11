/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题37：序列化二叉树
 * // 题目：请实现两个函数，分别用来序列化和反序列化二叉树。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.TreeNode;
import com.jchanghong.code.util.TreeUtil;
import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.io.StringReader;
import java.util.*;

public class Java37_SerializeBinaryTrees extends UtilAssert {

    String serialize(TreeNode head) {
//        return print2(head);
        return "";
    }

    TreeNode deSerize(String string) {
        return null;
//        List<Integer> list = new ArrayList<>();
//        Scanner scanner = new Scanner(new StringReader(string));
//        while (scanner.hasNext()) {
//            int i = -1;
//            try {
//                i = scanner.nextInt();
//                list.add(i);
//            } catch (Exception e) {
//            }
//        }
//        int[] ints = new int[list.size()];
//        for (int i=0;i<list.size();i++) {
//            ints[i] = list.get(i);
//        }
//        return TreeUtil.construct2(ints);
    }
    /**
     * @param head 层次遍历
     */
    public static String print2(TreeNode head) {
        List<StringBuilder> strings = new ArrayList<>();
        if (head == null) {
            return "";
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(head);
        TreeNode node;
        StringBuilder builder = new StringBuilder();
        while (queue.size() > 0) {
            node = queue.poll();
            if (node == null) {
                builder.append("* ");
            } else {
                builder.append(node.values+" ");
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return builder.toString();

    }


    @Test
    public void test() throws Exception {
        TreeNode head = TreeUtil.construct(Arrays.asList(1, 2, 3, 4, 5, 6));
        String s = serialize(head);
        TreeNode h2 = deSerize(s);
        isTrue(TreeUtil.valuesEqual(head, h2));
    }
}
