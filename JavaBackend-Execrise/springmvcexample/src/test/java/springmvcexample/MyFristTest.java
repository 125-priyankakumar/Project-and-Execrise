package springmvcexample;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyFristTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		int i =25;
		String str1 ="Priyanka";
		String str2 = new String("Priyanka");
		//assertTrue(i>20);
		//assertFalse(i>20);
		//assertNull(str1);
		assertEquals(str1,str2);

		}
	}

