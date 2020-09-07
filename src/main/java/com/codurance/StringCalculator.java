package com.codurance;

import java.util.Arrays;

class StringCalculator {

    StringCalculator() {}

    static Integer add(String commaSeparatedNumbers) {
        if (commaSeparatedNumbers.isEmpty()) {
            return 0;
        }

        return Arrays.asList(commaSeparatedNumbers.split(","))
                .stream()
                .mapToInt(i -> Integer.valueOf(i))
                .sum();
    }
}
