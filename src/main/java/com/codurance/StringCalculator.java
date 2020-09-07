package com.codurance;


public class StringCalculator {

    public static Integer add(String numbers) {
        if ("".equals(numbers)) {
            return 0;
        }

        return Integer.valueOf(numbers);
    }
}
