package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceArticleTest {

    @Test
    void articlePriceCalcNegPrice() {
        double expected = PriceArticle.articlePriceCalc(-6);
        assertEquals(-1, expected);
    }

    @Test
    void articlePriceCalcZeroPrice() {
        double expected = PriceArticle.articlePriceCalc(0);
        assertEquals(-1, expected);
    }

    @Test
    void articlePriceTwentyPC() {
        double expected = PriceArticle.articlePriceCalc(50);
        assertEquals(40.0, expected);
    }

    @Test
    void articlePriceThirtyPC() {
        double expected = PriceArticle.articlePriceCalc(51);
        assertEquals(35.7, expected,0.01);
    }

    @Test
    void articlePriceThirtyPCx() {
        double expected = PriceArticle.articlePriceCalc(100);
        assertEquals(70.0, expected,0.01);
    }

    @Test
    void articlePriceFhortyPC() {
        double expected = PriceArticle.articlePriceCalc(101);
        assertEquals(60.6, expected,0.01);
    }


    @Test
    void articlePriceFhortyPCx() {
        double expected = PriceArticle.articlePriceCalc(200);
        assertEquals(120, expected,0.01);
    }

    @Test
    void articlePriceSixtyPCx() {
        double expected = PriceArticle.articlePriceCalc(201);
        assertEquals(80.4, expected,0.01);
    }
}