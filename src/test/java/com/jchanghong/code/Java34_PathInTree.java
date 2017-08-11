/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题34：二叉树中和为某一值的路径
 * // 题目：输入一棵二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所
 * // 有路径。从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.TreeNode;
import com.jchanghong.code.util.TreeUtil;
import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.util.*;

public class Java34_PathInTree extends UtilAssert {
    /*
    如下的路径有“12”和“13”
    *       1

      2            3
    * */
    List<String> path(TreeNode head, int sum) {
        List<Integer> list = new LinkedList<>();
        List<String> result = new ArrayList<>();
        path2(head, list, 0,result,sum);
        return result;
    }


    //root =0
    void path2(TreeNode head, List<Integer> list, int high,List<String> result,int sum) {
        if (head != null) {
            list.add(head.values);
        }
        if (head.left == null&&head.right==null) {
            if (sum(list) == sum) {
                result.add(tostrings(list));
            }
        }
        if (head.left != null) {
            path2(head.left, list, high + 1,result,sum);
        }
        if (head.right != null) {
            path2(head.right, list, high + 1,result,sum);
        }
        list.remove(high);
    }
    @Test
    public void testpath() throws Exception {
        StringBuilder builder = new StringBuilder(1000);
        builder.insert(0, 'd');
        builder.insert(builder.length(), 'g');
        System.out.println(builder.toString());
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
    }

    String tostrings(List<Integer> integers) {
        StringBuilder builder = new StringBuilder();
        for (Integer integer : integers) {
            builder.append(integer);
        }
        return builder.toString();
    }
    int sum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }



    @Test
    public void test() throws Exception {
        TreeNode head = TreeUtil.construct2(10, 5, 12, 4, 7);
//        TreeUtil.print2(head);
        List<String> list = path(head, 22);
        eq(list.size(), 2);
        isTrue(list.contains("1012"));
        isTrue(list.contains("1057"));

    }
}
