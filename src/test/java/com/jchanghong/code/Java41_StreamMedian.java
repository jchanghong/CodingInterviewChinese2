/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * // 作者：何海涛
 * //==================================================================
 * <p>
 * // 面试题41：数据流中的中位数
 * // 题目：如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么
 * // 中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，
 * // 那么中位数就是所有数值排序之后中间两个数的平均值。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.UtilAssert;
import org.junit.Test;

import java.io.StringReader;
import java.util.Scanner;

public class Java41_StreamMedian extends UtilAssert{
    int media(Scanner scanner,int readnumber) {
        return 0;
    }

    @Test
    public void test() throws Exception {
        Scanner scanner = new Scanner(new StringReader("1 2 3 4 5"));
        while (scanner.hasNext()) {
            scanner.nextInt();
//            System.out.println(scanner.nextInt());
        }
        eq(media(scanner, 1), 1);
        eq(media(scanner, 2), 3/2);
        eq(media(scanner, 4), 5/2);
        eq(media(scanner, 5), 3);
    }
}
