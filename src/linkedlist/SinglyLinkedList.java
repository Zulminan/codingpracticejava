package linkedlist;

public class SinglyLinkedList {
	
	private Node head;
	private Node tail;
	
	class Node
	{
		int value;
		Node next;
		public Node(int value)
		{
			this.value=value;
		}
	}
	
	public SinglyLinkedList(int value)
	{
		Node newNode = new Node(value);
		
		head=newNode;
		tail=newNode;
	}
	
	public int findLength()
	{
		Node temp=head;
		
		int count=0;
		
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		
		return count;
	}
	
	public void append(int value)
	{
		Node newNode = new Node(value);
		
		if(findLength()==0)
		{
			head=newNode;
			tail=newNode;
		}
		
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
		
		
	}
	
	public void removeLast()
	{
		Node temp = head;
		
		while(temp.next.next!=null)
		{
				temp=temp.next;
			
		}
		
		temp.next=null;
		temp=tail;
	}
	
	public void prepend(int value)
	{
		Node newNode = new Node(value);
		
		if(findLength()==0)
		{
			head=newNode;
			tail=newNode;
		}
		
		else
		{
			newNode.next=head;
			head=newNode;
		}
		
	}
	
	public void removeFirst()
	{
		if(head==null)
		{
			System.err.println("Linked List Is Empty");
		}
		
		else
		{
			head=head.next;
		}
	}
	
	public Node get(int index)
	{
		int i=0;
		
		Node temp=head;
		
		while(i<index)
		{
			temp=temp.next;
			i++;
		}
		
		return temp;
	}
	
	public void set(int index, int value)
	{
		
		Node temp = head;
		
		
			int i = 0;
			
			while(i<index)
			{
				temp=temp.next;
				i++;
			}
			
			temp.value=value;
		}
	
	public void insert(int index,int value)
	{
		Node newNode = new Node(value);
		
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			
		}
		
		else
		{
			int i=0;
			int previousNodeIndex = index-1;
			Node temp = head;
			
			Node nextNode;
			
			while(i<previousNodeIndex)
			{
				temp=temp.next;
				i++;
			}
			
			nextNode=temp.next;
			
			temp.next=newNode;
			newNode.next=nextNode;
			
		}
		
	}
	
	public void remove(int index)
	{
		if(head==null)
		{
			System.err.println("Linked List is empty!");
		}
		
		
		int i=0;
		int previousNodeIndex=index-1;
		Node temp=head;
		
		Node nextNode;
		
		while(i<previousNodeIndex)
		{
			temp=temp.next;
		}
		
		nextNode=temp.next.next;
		
		temp.next=nextNode;
		
	}
	
	
	
	public void printLinkedList()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
	}

}
