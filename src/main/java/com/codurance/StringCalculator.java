package com.codurance;


class StringCalculator {

    StringCalculator() {}

    static Integer add(String commaSeparatedNumbers) {
        if (null == commaSeparatedNumbers || "".equals(commaSeparatedNumbers)) {
            return 0;
        }

        String[] numbers = commaSeparatedNumbers.split(",");
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.valueOf(number);
        }
        return sum;

    }
}
