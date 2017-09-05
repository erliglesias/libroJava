import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testRandomNumGen() {
		
		
		boolean [] aCheck = new boolean[1000];
		
		for (int i = 0; i < 1000; i++) {
			int num =  Hello.randomNumGen(4);
			if(num >=0 & num <=4){
				aCheck[num] = true;
			}
			
		}
		
		for (int i = 0; i < aCheck.length; i++) {
			assertTrue(aCheck[i]);
		}
		
	}

}
