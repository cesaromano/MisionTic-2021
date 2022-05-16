package com.mycompany.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class CalculatorTest {
    
    @Test
    public void square(){
        double result = Calculator.square(5.0);
        double expected = 125.0;
        assertEquals(expected, result);
    }
    
}
