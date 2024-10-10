package io.mazy.itsftechnicaltest.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleStrategyTest {

    @Test
    public void testMultipleOf3And5() {
        MultipleStrategy strategy = new ChaussettesStrategy();
        assertEquals("ChaussettesSales", strategy.getResult(15));
    }

    @Test
    public void testMultipleOf3() {
        MultipleStrategy strategy = new ChaussettesStrategy();
        assertEquals("Chaussettes", strategy.getResult(9));
    }

    @Test
    public void testMultipleOf5() {
        MultipleStrategy strategy = new ChaussettesStrategy();
        assertEquals("Sales", strategy.getResult(10));
    }

}