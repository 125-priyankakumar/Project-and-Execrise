package springmvcexample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.utility.calc.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		assertTrue(c.add(10, 10)==20);
		
	}
	
	@Test
	public void testSub() {
		Calculator c = new Calculator();
		assertTrue(c.sub(5, 3)==2);
	}
	
	

}
