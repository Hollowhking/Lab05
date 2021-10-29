package main;


public class SortedDoublyLinkedList implements LinkedList {

	public int assignmentCount=0;
	
	class Node{
		Warrior warrior;
		Node prev;
		Node next;
		
		public Node (Warrior warrior) {
			this.warrior=warrior;
		}
	}
//	public void sort() {
//		Node current = head, index = null;//+2 
//		//assignmentCount = assignmentCount + 2;
//		Warrior temp;
//		if (head == null) {
//			return;
//		}
//		else {
//			while (current != null) {
//				index = current.next;//+1
//				while (index != null) {
//					if (current.warrior.getSpeed()<index.warrior.getSpeed()) {
//						temp = current.warrior;//+1
//						current.warrior=index.warrior;//+1
//						index.warrior=temp;//+1
//						assignmentCount = assignmentCount + 3;
//					}
//					index = index.next;//+1
//					//assignmentCount = assignmentCount + 1;
//				}
//				current = current.next;//+1
//				assignmentCount = assignmentCount + 1;
//			}
//		}
//	}
	public Node head=null, tail=null;//init
	public void insert(Warrior warrior) {
		Node newnode = new Node(warrior);
		
		if (head==null) {
			head = tail = newnode;//+2
			//both next and prev are null
			head.prev=null;//+1
			head.next=null;//+1
			assignmentCount+=1;

		}
		else {
			Node current = this.head;
			assignmentCount+=1;
			//newnode
			assignmentCount+=1;
			
			if (newnode.warrior.getSpeed()>= this.head.warrior.getSpeed()) {
				assignmentCount+=3;
				this.head.prev=newnode;
				newnode.next=this.head;
				this.head=newnode;
				return;
			}
			
			while (current.next != null) {
				if (newnode == current.next) {
					break;
				}
				else {
					assignmentCount+=1;
					current = current.next;
				}
			}
			if (current.next==null) {
				assignmentCount+=2;
				current.next=newnode;
				newnode.prev=current;
			}
			else {
				assignmentCount+=4;
				current.next.prev=newnode;
				newnode.next=current.next;
				newnode.prev=current;
				current.next=newnode;
			}
		}
	}
}