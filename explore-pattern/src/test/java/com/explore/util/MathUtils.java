package com.explore.util;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class MathUtils {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(100.5,new MathContext(2, RoundingMode.HALF_UP));

        System.out.println(a.toPlainString());
        System.out.println(a.doubleValue());
    }
}
