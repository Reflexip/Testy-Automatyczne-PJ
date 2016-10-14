package pl.tau.lab01.zad1;

import static org.hamcrest.CoreMatchers.not;
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
        Integer number = Integer.valueOf(3);
        assertSame("Powinny być takie same", number, calculator.sub(6, 3));
    }

    @Test
    public void testMulti() {
        assert 5 == calculator.multi(5, 1);
    }

    @Test
    public void testDiv() {
        assert 10 <= calculator.div(20, 2)
                : "Błąd, wynik powinien być większy lub równy 10";
    }
   
    @Test
    public void testDivWithException() {
        calculator.div(3, 0);
    }

    @Test
    public void testGreater() {
        assertTrue("Błąd, powinno zwrócić true", calculator.greater(3, 1));
    }
    @Test
    public void testGreaterAssertThat() {
        assertThat(calculator.greater(3, 2), not(false));
    }
    
    
}
