import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayListTestCases {

	@Before
	public void BeforeTest()
	{
		ArrayList listArray=new ArrayList();
	}
	@Test
	public void testAddElement() {
		for(int i=0;i<=4;i++)
		{
			
			ArrayList.addElement(i+1);
		}
     int[] array2= {1,2,3,4,5};
		
		for(int i=0;i<=4;i++)
		{
			assertEquals(array2[i],ArrayList.getElement(i));
		}
	}
	@Test
	public void testAddElementFail() {
		ArrayList.addElement(0);
		assertEquals(null,ArrayList.array);
	}
	
	
	
	@Test
	public void  testRemoveElement()
	{
		for(int i=0;i<=4;i++)
		{
			
			ArrayList.addElement(i+1);
		}
			
			ArrayList.removeElement(1);
		
     int[] array2= {1,3,4,5};
		
		for(int i=0;i<=3;i++)
		{
			assertEquals(array2[i],ArrayList.getElement(i));
		}
		
	}
	@Test
	public void  testRemoveElementFail()
	{
		ArrayList.removeElement(0);
		assertEquals(null,ArrayList.array);
		
	}
}
