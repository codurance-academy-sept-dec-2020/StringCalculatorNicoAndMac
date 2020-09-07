package com.codurance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorShould {

    @Test
    void return_zero_when_given_an_empty_string() {
        int numericRepresentation = StringCalculator.add("");
        assertEquals(0, numericRepresentation);
    }

    @Test
    void return_numeric_value_of_a_single_number_as_a_string() {
        int numericRepresentation = StringCalculator.add("1");
        assertEquals(1, numericRepresentation);
    }

    @Test
    void return_sum_of_two_comma_separated_numbers() {
        int numericRepresentation = StringCalculator.add("1,2");
        assertEquals(3, numericRepresentation);
    }

    @Test
    void return_sum_of_any_amount_of_comma_separated_numbers() {
        assertEquals(6, StringCalculator.add("1,2,3"));
        assertEquals(5, StringCalculator.add("1,1,1,1,1"));
    }
}
