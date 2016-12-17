package pl.tau.lab01.zad3;

import org.junit.Test;
import static org.junit.Assert.*;

public class LiczbaRzymskaTest {
   
	
	LiczbaRzymska liczbaRzymska =  new LiczbaRzymska();

	@Test
	public void testNegative() {
		liczbaRzymska.setLiczba(-1);
		assertEquals("I", liczbaRzymska.toString());
	}
	
	@Test
	public void testToHighValue() {
		liczbaRzymska.setLiczba(4000);
		assertEquals("More than 3999", liczbaRzymska.toString());
	}
	
	@Test
	public void testEquals1234(){
		liczbaRzymska.setLiczba(1234);
		assertEquals("MCCXXXIV", liczbaRzymska.toString());
	}
	
	@Test
	public void testEquals946(){
		liczbaRzymska.setLiczba(946);
		assertEquals("CMXLVI", liczbaRzymska.toString());
	}
    
    
}
