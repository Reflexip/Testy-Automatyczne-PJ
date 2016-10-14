/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tau.lab01.zadGwiazdka;

import pl.tau.lab01.zadGwiazdka.NieudanyPsikusException;
import pl.tau.lab01.zadGwiazdka.Kontrakt;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dawid
 */
public class KontraktTest {
    
    public KontraktTest() {
    }
    Kontrakt kontrakt = new Kontrakt();
    
    @Test
    public void testCyfrokradLength() {
        assertSame(3, String.valueOf(kontrakt.cyfrokrad(3456)).length());        
    }
    @Test
    public void testCyfrokradNull() {
        assertNull(kontrakt.cyfrokrad(4));
    }
    
    @Test(expected = NieudanyPsikusException.class)
    public void testHultajchochla() throws Exception {
        kontrakt.hultajchochla(2);
    }
    
}
