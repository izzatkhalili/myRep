import static org.junit.Assert.*;

import org.junit.Test;

public class addsTest {

	@Test
	public void test() {
		adds d=new adds();
		int result=d.adds1(3, 5);
		
		assertEquals(8,result);
	}

}
