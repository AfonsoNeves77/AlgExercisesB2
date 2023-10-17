package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrescentNumberTest {

    @Test
    void isValidNumberWithBorderLine() {
        boolean expected = CrescentNumber.isValidNumber(999);
        assertTrue(expected);
    }

    @Test
    void isValidNumberWithLowBorderLine() {
        boolean expected = CrescentNumber.isValidNumber(100);
        assertTrue(expected);
    }

    @Test
    void isValidNumberBorderLine() {
        boolean expected = CrescentNumber.isValidNumber(1000);
        assertFalse(expected);
    }

    @Test
    void isValidNumberLowBorderLine() {
        boolean expected = CrescentNumber.isValidNumber(99);
        assertFalse(expected);
    }

    @Test
    void isCrescent() {
        boolean expected = CrescentNumber.isCrescent(156);
        assertTrue(expected);
    }

    @Test
    void isNotCrescent() {
        boolean expected = CrescentNumber.isCrescent(153);
        assertFalse(expected);
    }

    @Test
    void isNotCrescent2() {
        boolean expected = CrescentNumber.isCrescent(162);
        assertFalse(expected);
    }


    @Test
    void isNotCrescentNegNumber() {
        boolean expected = CrescentNumber.isCrescent(-162);
        assertFalse(expected);
    }
}