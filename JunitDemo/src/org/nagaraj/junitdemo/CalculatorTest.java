package org.nagaraj.junitdemo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.add(2, 5));
    }

    
}
