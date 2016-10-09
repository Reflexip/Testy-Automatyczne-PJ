package pl.tau.lab01.zad1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    Calculator calculator = new Calculator();
    
    public CalculatorTest() {
    }
    
    @Test
    public void testAdd() {
        assertEquals(5,calculator.add(2, 3));
    }

    @Test
    public void testSub() {
        assertEquals(2, calculator.sub(4, 2));
    }

    @Test
    public void testMulti() {
        assertEquals(4, calculator.multi(2, 2));
    }

    @Test
    public void testDiv() {
        assertEquals(5, calculator.div(10, 2));
    }
    
    @Test
    public void testDivWithException() {
        assertEquals(5, calculator.div(10, 0));
    }

    @Test
    public void testGreater() {
        assertEquals(true, calculator.greater(5, 3));
    }
    
}
