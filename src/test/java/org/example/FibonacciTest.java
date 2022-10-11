package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void shouldReturnZeroForZeroElement() {
        Assertions.assertEquals(0, Fibonacci.getValue(0));
    }

    @Test
    void shouldReturnOneForFirstElement() {
        Assertions.assertEquals(1, Fibonacci.getValue(1));
    }

    @Test
    void shouldReturnValue() {
        Assertions.assertEquals(8, Fibonacci.getValue(6));
        Assertions.assertEquals(144, Fibonacci.getValue(12));
        Assertions.assertEquals(987, Fibonacci.getValue(16));
    }
}
