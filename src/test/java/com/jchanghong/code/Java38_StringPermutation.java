/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题38：字符串的排列
 * // 题目：输入一个字符串，打印出该字符串中字符的所有排列。例如输入字符串abc，
 * // 则打印出由字符a、b、c所能排列出来的所有字符串abc、acb、bac、bca、cab和cba。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Java38_StringPermutation extends UtilAssert {
    Set<String> allString(String text) {
        if (text.length() == 1) {
            return Collections.singleton(text);
        }
        if (text.length() == 2) {
            Set<String> strings = new HashSet<>();
            strings.add(text);
            strings.add(new StringBuilder(text).reverse().toString());
            return strings;
        }
        Set<String> strings = new HashSet<>();
        int m = text.length() / 2;
        String one = text.substring(0, m);
        String two = text.substring(m + 1, text.length());
        Set<String> set1 = allString(one);
        Set<String> set2 = allString(two);
        strings = merger(set1, set2);
        return strings;
    }

    private Set<String> merger(Set<String> set1, Set<String> set2) {
        Set<String> strings = new HashSet<>();
        for (String s : set1) {
            for (String s1 : set2) {
                strings.add(s + s1);
            }
        }
        return strings;
    }

    @Test
    public void test2() throws Exception {
        Set<String> strings = allString("ab");
        isTrue(strings.size() == 2);
        isTrue(strings.contains("ba"));

    }

    @Test
    public void test() throws Exception {
        Set<String> strings = allString("abc");
        eq(strings.size(), 6);
        isTrue(strings.contains("acb"));

    }
}
