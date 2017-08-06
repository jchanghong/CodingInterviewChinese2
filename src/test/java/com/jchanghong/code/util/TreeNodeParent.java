package com.jchanghong.code.util;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: jiang
 * \* Date: 2017/8/6 0006
 * \* Time: 9:21
 * \
 */
public class TreeNodeParent  {


    public TreeNodeParent parent;
    public Integer values;
    public TreeNodeParent left;
    public TreeNodeParent right;

    public TreeNodeParent(TreeNodeParent parent, Integer values, TreeNodeParent left, TreeNodeParent right) {
        this.parent = parent;
        this.values = values;
        this.left = left;
        this.right = right;
    }
}
