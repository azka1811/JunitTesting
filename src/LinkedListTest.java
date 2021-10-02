
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class LinkedListTest
{
	@Before
	public void BeforeTest()
	{
		LinkedList list=new LinkedList();
	}
	@Test
	public void testPushFront()
	{
		LinkedList.pushFront(8);
		{
			assertEquals(8,LinkedList.head.key);
		}	
	}
	
	
	@Test
	public void testPushBack()
	{
		LinkedList.pushBack(3);
		LinkedList.pushBack(7);	
		assertEquals(3,LinkedList.head.key);
	}
	@Test
	public void testPopFront()
	{
		LinkedList.pushBack(3);
		LinkedList.pushBack(5);
		LinkedList.popFront();
		assertEquals(5,LinkedList.head.key);
	}
	@Test
	public void testpopBack()
	{
		LinkedList.pushBack(4);
		
		LinkedList.popBack();
		assertEquals(null,LinkedList.head);
	}
}
