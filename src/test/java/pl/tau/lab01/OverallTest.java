package pl.tau.lab01;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  pl.tau.lab01.zad1.CalculatorTest.class,
  pl.tau.lab01.zad2.CalculatorTest.class,
  pl.tau.lab01.zad3.LiczbaRzymskaTest.class,  
})

public class OverallTest {
    
    public OverallTest() {
    }
    
}
