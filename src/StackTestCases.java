import static org.junit.Assert.*;

import org.junit.Test;

public class StackTestCases {

	@Test
	public void testPushPass()
	{
		Stack.push(21900000);
		assertEquals(21900000,Stack.top());
	}
	@Test
	public void testPushFail()
	{
		
	    Stack.push('w');
		assertEquals(" w",Stack.top());
	}
	@Test
	public void testPopPass()
	{
		Stack.pop();
		assertEquals(-1,Stack.top());
	}
	@Test
	public void testPopFail()
	{
		Stack.pop();
		assertNull(null,Stack.top());
	}
	


}
