package com.jchanghong.code.util;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: jiang
 * \* Date: 2017/8/9 0009
 * \* Time: 17:01
 * \测试数据
 */
public class Const {
    static public List<Integer> integerList = new ArrayList<>(1000);
    static public List<String> stringList = new ArrayList<>(1000);

    static {
        for (int i = 0; i < 1000; i++) {
            integerList.add(i);
            stringList.add("hello" + i);
        }
    }

}
