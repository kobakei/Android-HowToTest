package io.github.kobakei.androidhowtotest.util;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by keisuke on 16/03/03.
 */
public class CalculatorTest {
    @Test
    public void add_IsCorrect() {
        assertEquals(4, Calculator.add(1, 3));
    }

    @Test
    public void subtract_IsCorrect() {
        assertEquals(2, Calculator.subtract(5, 3));
    }

    @Test
    public void multiply_IsCorrect() {
        assertEquals(15, Calculator.multiply(5, 3));
    }

    @Test
    public void divide_IsCorrect() {
        assertEquals(2, Calculator.divide(6, 3));
    }
}
