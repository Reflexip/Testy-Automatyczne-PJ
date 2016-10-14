package pl.tau.lab1.zadGwiazdka;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class KontraktTestSecond {
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 {328, 828}, {274, 214}, {248, 248}  
           });
    }
    
    private int kInput;
    private int kExcepted;
    
    public KontraktTestSecond(int input, int excepted) {
        this.kInput = input;
        this.kExcepted = excepted;
    }
    
    Kontrakt kontrakt = new Kontrakt();
    
    @Test
    public void testNiekształtek(){
        assertSame(kExcepted, kontrakt.niekształtek(kInput));
    }
}
