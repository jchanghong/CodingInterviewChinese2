/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题46：把数字翻译成字符串
 * // 题目：给定一个数字，我们按照如下规则把它翻译为字符串：0翻译成"a"，1翻
 * // 译成"b"，……，11翻译成"l"，……，25翻译成"z"。一个数字可能有多个翻译。例
 * // 如12258有5种不同的翻译，它们分别是"bccfi"、"bwfi"、"bczi"、"mcfi"和
 * // "mzi"。请编程实现一个函数用来计算一个数字有多少种不同的翻译方法。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

public class Java46_TranslateNumbersToStrings extends UtilAssert {
    //12258->
    //1 2258
    //12 258
    int number(int number) {
        if (number < 100) {
            if (number <= 25)
                return 2;
            else
                return 1;
        }
        TWO two = first2(number);
        if (two.one <= 25) {
            TWO two1 = firt1(number);
            int number1 = number(two1.two);
            int number2 = number(two.two);
            return number1 + number2;
        }
        else {
            return number(two.two);
        }
    }

    char int2char(int i) {
        return (char) (i +'a');
    }

    static class TWO {
        public int one;
        public int two;

        public TWO(int one, int two) {
            this.one = one;
            this.two = two;
        }
    }
    TWO firt1(int i) {
        TWO two = new TWO(0, 0);
        String s = String.valueOf(i);
        two.one= Integer.valueOf(s.substring(0, 1));
        two.two = Integer.valueOf(s.substring(1));
        return two;
    }
    TWO first2(int i) {
        TWO two = new TWO(0, 0);
        String s = String.valueOf(i);
        two.one= Integer.valueOf(s.substring(0, 2));
        two.two = Integer.valueOf(s.substring(2));
        return two;
    }

    @Test
    public void test2() throws Exception {
        isTrue(int2char(0)=='a');
        isTrue(int2char(25)=='z');
    }

    @Test
    public void test() throws Exception {
        eq(number(12258), 5);
        eq(number(0), 1);
    }
}
