package com.codurance;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {

    @Test
    public void return_zero_when_given_an_empty_string() {
        int sum = StringCalculator.add("");
        assertEquals(0, sum);
    }
}