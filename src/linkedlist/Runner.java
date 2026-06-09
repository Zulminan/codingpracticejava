package linkedlist;

public class Runner {

	public static void main(String[] args) {
		
		SinglyLinkedList singlyLinkedListUpdated = new SinglyLinkedList(10);
		
		singlyLinkedListUpdated.append(20);
		
		singlyLinkedListUpdated.append(30);
		
		singlyLinkedListUpdated.append(40);
		singlyLinkedListUpdated.append(50);
		singlyLinkedListUpdated.append(60);
		
		//singlyLinkedListUpdated.display();
		
		System.out.println(singlyLinkedListUpdated.get(-1).value);
		
		//Stack stack = new Stack(0);
		
		
        
        

	}

}




