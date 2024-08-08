package com.telran.org.lessontwelve;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    //@ - все что начинается с этого символа - это аннотации
    @Test
    public void sumTest() {
        assertEquals(2, calculator.sum(1, 1));
    }

    @Test
    public void subTest() {
        assertEquals(3, calculator.sub(5, 2));
    }
}