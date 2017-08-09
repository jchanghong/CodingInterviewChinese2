package com.jchanghong.code.util;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: jiang
 * \* Date: 2017/8/9 0009
 * \* Time: 18:16
 * \
 */
public class UtilAssert {
    protected void eq(Object object, Object object2) {
        org.junit.Assert.assertEquals(object, object2);
    }

    protected void isTrue(boolean aBoolean) {
        org.junit.Assert.assertTrue(aBoolean);
    }
    protected void isFalse(boolean aBoolean) {
        org.junit.Assert.assertFalse(aBoolean);
    }
}
