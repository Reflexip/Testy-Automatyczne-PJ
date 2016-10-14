package pl.tau.lab01.zad3;

import org.junit.Test;
import static org.junit.Assert.*;

public class LiczbaRzymskaTest {
    LiczbaRzymska ujemna = new LiczbaRzymska(-9);
    LiczbaRzymska zaDuża = new LiczbaRzymska(4500);
    LiczbaRzymska zero = new LiczbaRzymska(0);
    LiczbaRzymska zmiennoprzecinkowa = new LiczbaRzymska((int) 10.50);
    
    
    public LiczbaRzymskaTest() {
    }

    @Test
    public void testUjemna() {
        assertEquals("IX", ujemna.toString());
    }
    @Test
    public void testZaDuża(){
        assert "" == zaDuża.toString();
    }
    @Test
    public void testZero(){
        assertNotNull(zero.toString());
    }
    @Test 
    public void testZmiennoprzecinkowa(){
        assertSame("X", zmiennoprzecinkowa.toString());
    }
    
}
