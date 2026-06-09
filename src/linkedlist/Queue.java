package linkedlist;

public class Queue {
	
	private Node front;
	private Node rear;
	
	public class Node
	{
		int value;
		Node next;
		
		public Node(int value)
		{
			this.value=value;
		}
	}
	
	public Queue(int value)
	{
		Node newNode = new Node(value);
		
		if(front==null)
		{
			front=newNode;
			rear=newNode;
		}
		
	}
	
	public void enqueue(int value)
	{
		Node newNode = new Node(value);
		
		if(front==null)
		{
			front=newNode;
			rear=newNode;
			newNode.next=null;
		}
		
		else
		{
			rear.next=newNode;
			rear=newNode;
			newNode.next=null;
		}
	}
	
	public int dequeue()
	{
		Node nextNode=null;
		int deletedElement=0;
		
		if(front==null)
		{
			return 0;
		}
		
		else if(front==rear)
		{
			deletedElement=front.value;
			front=null;
			rear=null;
			
			return deletedElement;
		}
		
		else
		{
			deletedElement=front.value;
			
			nextNode=front.next;
			front=nextNode;
			
			return deletedElement;
			
		}
		
	}
	
	public int peek()
	{
		if(front==null)
		{
			return 0;
		}
		
		else
		{
			return front.value;
		}
	}
	
	public boolean isEmpty()
	{
		if(front==null)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public int size()
	{
		Node temp=front;
		int count=0;
		
		while(temp!=null)
		{
			count++;
			
			temp=temp.next;
		}
		
		return count;
	}

}







