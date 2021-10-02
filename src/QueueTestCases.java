import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueueTestCases {
	//class for elements.
		static class Node{
			int key;  //data value
			Node next;//points to next element in the queue. 
			
			public Node(int data){
				this.key=data;
				this.next=null;
			}
		}
		
		static int size;   //number of elements in the queue.
		static Node head;  //head of the queue i.e first element.
		
		public QueueTestCases(){
			size=0;
			head=null;
		}

		//function to add elements in the queue.
		static public void enqueue(int number){
			System.out.println("Inserting : " + number);
			Node node =new Node(number);

			//if queue is empty.
			if(head==null){
				head=node;
				size++;
				return;
			}

			Node temp= head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=node;
			size++;
		}

		//function to delete elements from the queue.
		static public int dequeue(){
			System.out.println("Dequeue Operation.");
			//if queue is empty.
			if(head==null){
				System.out.println("Empty queue.");
				return -1;
			}
			int temp = head.key;
			head=head.next;
			size--;
			return temp;
		}
			
		static public void display(){
			if(head==null){
				System.out.println("Empty queue.");
				return;
			}

			System.out.print("Queue : ");
			Node temp = head;
			while(temp!=null){
				System.out.print(temp.key + " ");		
				temp = temp.next;
			}
			System.out.println();
		}
		@Before
		public  void BeforeTest()
		{
			QueueTestCases queueObj=new QueueTestCases();
			
		}
	@Test
	public  void testEnqueuePass() {
	Node current;
		current=head;
		for(int i=0;i<=5;i++)
		{
			QueueTestCases.enqueue(i);
		}
		
		while(current!=null)
		{
			for(int i=0;i<=5;i++)
			{
					assertEquals(i, current.key);
			}
			current=current.next;
		}
	}
	@Test
	public  void testEnqueueFail() {
	
		QueueTestCases.enqueue(0);
		assertNull(null,QueueTestCases.head);
	}
	@Test
	public  void testDequeuePass() {
	
		for(int i=0;i<=5;i++)
		{
			QueueTestCases.dequeue();
		}
		
		assertNull(null,QueueTestCases.head);
	}
	@Test
		public  void testDequeueFail()
		{
		Node current;
			
				QueueTestCases.dequeue();
			
			
			assertEquals(0,QueueTestCases.head.key);
		}
}
