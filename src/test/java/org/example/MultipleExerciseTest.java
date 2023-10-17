package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MultipleExerciseTest {

    @org.junit.jupiter.api.Test
    void isMultipleTwelveAndTwentyFour() {
        String expected = MultipleExercise.isMultiple(24,12);
        assertEquals(expected, 24.0 + " is multiple of " + 12.0);
    }

    @org.junit.jupiter.api.Test
    void isMultipleDecimalNumber() {
        String expected = MultipleExercise.isMultiple(12.5,25);
        assertEquals(expected, 25.0 + " is multiple of " + 12.5);
    }

    @org.junit.jupiter.api.Test
    void bothAreMultiples() {
        String expected = MultipleExercise.isMultiple(0,0);
        assertEquals(expected, "Both are multiples");
    }

    @org.junit.jupiter.api.Test
    void isMultipleNumberIsZero() {
        String expected = MultipleExercise.isMultiple(0,25);
        assertEquals(expected, 0.0 + " is multiple of " + 25.0);
    }


    @org.junit.jupiter.api.Test
    void noneIsMultiple() {
        String expected = MultipleExercise.isMultiple(-5,-4);
        assertEquals(expected, -5.0 + " is not multiple/divisor of " + -4.0 + ". " + -4.0 + " is not multiple/divisor of " + -5.0);
    }
}