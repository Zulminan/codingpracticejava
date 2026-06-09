package linkedlist;

public class Stack {
	
	private Node top;
	
	public class Node
	{
		int value;
		Node next;
		
		public Node(int value)
		{
			this.value=value;
		}
	}
	
	public Stack(int value)
	{
		Node newNode = new Node(value);
		top=newNode;
		
	}
	
	public void push(int value)
	{
		Node newNode = new Node(value);
		
		if(top==null)
		{
			top=newNode;
		}
		
		else 
		{
			newNode.next=top;
			top=newNode;
		}
		
	}
	
	public int pop()
	{
		Node nextNode=null;
		int poppedValue=0;
		if(top==null)
		{
			System.err.println("Stack is empty!!!");
		}
		
		else
		{
			poppedValue=top.value;
			
			nextNode=top.next;
			top=nextNode;
		}
		
		return poppedValue;
	}
	
	public int peek()
	{
		if(top==null)
		{
			System.err.println("Stack is empty");
			return 0;
		}
		
		else
		{
			return top.value;
		}
	}
	
	public boolean isEmpty()
	{
		if(top==null)
		{
			return true;
		}
		
		else
		{
			return false;
		}
		
	}
	
	public void display()
	{
		Node temp=top;
		
		if(top == null)
	    {
	        System.out.println("Stack is empty!");
	        return;
	    }

		
		while(temp!=null)
		{
			System.out.println(temp.value);
			
			temp=temp.next;
		}
	}
	
	public int size()
	{ 
      Node temp=top;
      int count=0;
		
		if(top == null)
	    {
	        return 0;
	    }

		
		while(temp!=null)
		{
			count++;
			
			temp=temp.next;
		}
		
		return count;
	}
	
}