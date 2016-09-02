package com;

import java.math.BigDecimal;

/**
 * Created by Awen on 2016/9/2.
 */
public class NumberUtil {

    public static long getLong(Long l) {
        if (l == null)
            return 0;
        return l;
    }

    public static double getDouble(Double d) {
        if (d == null)
            return 0;
        return d;
    }

    public static byte getByte(Byte b) {
        if (b == null)
            return 0;
        return b;
    }

    public static String getBigDecimal(BigDecimal bigDecimal) {
        if (bigDecimal == null)
            return "0";
        return bigDecimal.toString();
    }

}
