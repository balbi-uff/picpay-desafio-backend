package com.balbicorp.picpay.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void TwoPlusTwoShouldEqualFour(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(calculator.add(2, 2), 4);
    }

    @Test
    void ThreePlusSevenEqualTen(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(calculator.add(3, 7), 10);
    }

}
