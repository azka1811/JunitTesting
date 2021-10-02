import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayTestCases {

	@Before
	public void BeforeTest()
	{
		Array array1=new Array();
		
	}
		
	
	@Test
	public void testArrayInsertionPass() {
		//array insertion check.
	
		for(int i=0;i<=5;i++)
		{
			Array.insert(i+1, i);
		}
		Array.display();
		int[] array2= {1,2,3,4,5,6};
		
		for(int i=0;i<=5;i++)
		{
			assertEquals(array2[i],Array.getAt(i));
		}
		
	}
	@Test
	public void testArrayInsertionFail() {
		//array insertion check.
	
					assertNull(null,Array.getAt(0));
		
	
	}
	@Test
	public void testDeletionPass()
	{
		System.out.println("yes");
		for(int i=0;i<=5;i++)
		{
			Array.insert(i+1, i);
		}
		
	    Array.delete(0);
		
		Array.display();
		int [] array3= {2,3,4,5,6};
		for(int i=0;i<=4;i++)
		{
			assertEquals(array3[i],Array.array[i]);
		}
		
	}
	@Test
	public void testDeletionFail()
	{
		
		for(int i=0;i<=5;i++)
		{
			Array.delete(i);
		}
		assertEquals(null,Array.array[6]);
	   
		
	}
	@Test
	public void testLinearSearchPass()
	{
		boolean flag=true;
		for(int i=0;i<=5;i++)
		{
			Array.insert(i+1, i);
		}
		boolean ans=Array.linearSearch(5);
		assertEquals(flag,ans);
	}
	@Test
	public void testLinearSearchFail()
	{
		boolean flag=true;
		for(int i=0;i<=5;i++)
		{
			Array.insert(i+1, i);
		}
		boolean ans=Array.linearSearch(7);
		assertEquals(flag,ans);
	}
	@Test
	public void testBinarySearch()
	{
		boolean flag=true;
		for(int i=0;i<=5;i++)
		{
			Array.insert(i+1, i);
		}
		boolean ans=Array.binarySearch(5,0,5);
		assertEquals(flag,ans);
	}
	@Test
	public void testBinarySearchFail()
	{
	    
		assertEquals(false,Array.binarySearch(0,0,0));
	}
	
	@Test
	public void testBubbleSort  ()
	{
		
		 for (int i=0, j=5; i<5; i++,j--)
		 {
			Array.insert(j, i);
		}
		Array.display();
		int []array4= {1,2,3,4,5};
		Array.bubbleSort();
		for(int i=0;i<=4;i++)
		{
			assertEquals(array4[i],Array.array[i]);
		}
		
		
	}
	@Test
	public void testBubbleSortFail ()
	{
		
		 Array.insert('c', 0);
		 Array.insert('b', 1);
		 Array.insert('a', 0);
		 assertEquals("a",Array.array[0]);
		
		
	}
	

}
