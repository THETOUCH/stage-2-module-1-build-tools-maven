package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //code!
        return NumberUtils.toDouble(str) > 0;
    }
}
