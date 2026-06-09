package linkedlist;

public class SinglyLinkedList {

	private Node head;
	private Node tail;

	public class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}

	}

	public SinglyLinkedList(int value) {
		Node newNode = new Node(value);

		if (head == null) {
			head = newNode;
			tail = newNode;
		}

	}

	public void prepend(int value)
	{
		Node newNode = new Node(value);
		
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			newNode.next=null;
		}
		
		else if(head==tail)
		{
			newNode.next=head;
			head=newNode;
		}
		
		else
		{
			newNode.next=head;
			head=newNode;
		}
				
	}
	
	public void append(int value)
	{
		Node newNode = new Node(value);
		
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			newNode.next=null;
		}
		
		else if(head==tail)
		{
			tail.next=newNode;
			tail=newNode;
			newNode.next=null;
		}
		
		else
		{
			tail.next=newNode;
			tail=newNode;
			newNode.next=null;
		}
	}
	
	public void remove(int index)
	{
		
		if(head==null)
		{
			System.err.println("Linked List Is Empty!!!");
		}
		
		else if(head==tail)
		{
			head=null;
			tail=null;
		}
		
		
		else if(index==0)
		{
		   Node nextNode=null;
		   
		   nextNode=head.next;
		   head=nextNode;
		}
		
		else if(index==findLength()-1)
		{
			int i=0;
			int previousIndex=findLength()-2;
			Node temp=head;
			while(i<previousIndex)
			{
				temp=temp.next;
				i++;
				
			}
			
			temp.next=null;
			tail=temp;
		}
		
		else if(index<0)
		{ 
			 System.err.println("Invalid Index!!! The index must be greater than or equal to zero");
			
		}
		
		else if(index>findLength())
		{
			System.err.println("Invalid Index!!! The index must be less than length");
		}
		
		else
		{
			Node nextNode=null;
			int i=0;
			int previousIndex=index-1;
			Node temp=head;
			
			while(i<previousIndex)
			{
				temp=temp.next;
				i++;
			}
			
			nextNode=temp.next.next;
			
			temp.next=nextNode;
			
		}
		
	}
	
	public Node get(int index)
	{
		int i=0;
		int previousIndex=index-1;
		
		if(index==0)
		{
			Node temp=head;
			
			return temp;
		}
		
		if(index==1)
		{
			Node temp=null;
			
			temp=head.next;
			
			return temp;
		}
		
		else if(index==findLength()-1)
		{
		    Node temp=head;
		    
		    while(i<previousIndex)
		    {
		    	temp=temp.next;
		    	i++;
		    }
		    
		    temp=temp.next;
		    
		    return temp;
			
		}
		
		else if(index<0)
		{
			System.err.println("Invalid Index");
			return null;
		}
		
		else 
		{
			Node temp=head;
			
			while(i<previousIndex)
			{
				temp=temp.next;
				i++;
			}
			
			return temp.next;
		}
		
	}
	
	
	public void display()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
		
	}
	
	
	public int findLength()
	{
		Node temp = head;
		
		int count=0;
		
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		
		return count;
	}

}
