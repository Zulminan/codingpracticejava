package linkedlist;

public class Runner {

	public static void main(String[] args) {
		
		SinglyLinkedList myLinkedList = new SinglyLinkedList(4);

        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.append(7);
        
       // myLinkedList.set(1, 8);
        
       myLinkedList.remove(2);
        
        //myLinkedList.insert(2, 6);
        
        
        
        myLinkedList.printLinkedList();
        
        

	}

}
