/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * //
 * //==================================================================
 * <p>
 * // 面试题12：矩阵中的路径
 * // 题目：请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有
 * // 字符的路径。路径可以从矩阵中任意一格开始，每一步可以在矩阵中向左、右、
 * // 上、下移动一格。如果一条路径经过了矩阵的某一格，那么该路径不能再次进入
 * // 该格子。例如在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字
 * // 母用下划线标出）。但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个
 * // 字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。
 * // A B T G
 * // C F C S
 * // J D E H
 */
package com.jchanghong.code;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.XMLFormatter;

public class Java12_StringPathInMatrix {

    public boolean havePath(char[][] chars, String string) {
        boolean[][] visit = new boolean[chars.length][chars[0].length];
        for (int i=0;i<chars.length;i++) {
            for (int j=0;j<chars[i].length;j++) {
                visit[i][j] = false;
            }
        }
        int index = 0;
        for (int i=0;i<chars.length;i++) {
            for (int j=0;j<chars[i].length;j++) {
                if (havepath(chars, visit, i, j, string, index)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean havepath(char[][] chars,boolean[][] visit, int x, int y, String string,int index) {
        if (index == string.length()) {
            return true;
        }
        if (x < 0 || y < 0 || x >= chars.length || y >= chars[0].length) {
            return false;
        }
        if (visit[x][y]) {
            return false;
        }
        else {
            if (chars[x][y] == string.charAt(index)) {
                visit[x][y] = true;
                boolean re= havepath(chars, visit, x + 1, y, string, index + 1) ||
                        havepath(chars, visit, x, y + 1, string, index + 1) ||
                        havepath(chars, visit, x - 1, y, string, index + 1) ||
                        havepath(chars, visit, x, y - 1, string, index + 1);
                if (re == false) {
                    index--;
                    visit[x][y] = false;
                }
                return re;
            }
            return false;
        }
    }

    @Test
    public void test() throws Exception {
        char[][] chars = {{'a', 'b', 't', 'g'},
                {'c', 'f', 'c', 's'},
                {'j', 'd', 'e', 'h'}
        };
        Assert.assertEquals(havePath(chars, "bfce"), true);
        Assert.assertEquals(havePath(chars, "abfb"), false);
    }
}
