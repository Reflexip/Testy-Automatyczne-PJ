package pl.tau.lab01.zad2;

import static org.hamcrest.CoreMatchers.not;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    Calculator calculator = new Calculator();
    
    public CalculatorTest() {
    }
    
    @Test
    public void testAdd() {
        assertEquals(5.00,calculator.add(2.00, 3.00), 2);
    }

    @Test
    public void testSub() {
        Double number = 3.33;
        assert number == calculator.sub(4, 0.67);
    }

    @Test
    public void testMulti() {
        assert 5 == calculator.multi(5, 1);
    }

    @Test
    public void testDiv() {
        assert 10.00 <= calculator.div(20.00, 2.00)
                : "Błąd, wynik powinien być większy lub równy 10";
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
