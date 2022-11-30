package One;

public class LinkedList {
	Node head;
	Node tail;
	
	
	public static void main(String[] args) {
		
		LinkedList obj=new LinkedList();
		obj.insertDataTail(60);
		obj.insertDataTail(50);
		obj.insertDataTail(40);
		obj.insertDataTail(30);
		obj.insertDataTail(20);
		
		
		
		obj.printList();
		
		System.out.println("tail");
		obj.insertDataHead(60);
		obj.insertDataHead(50);
		obj.insertDataHead(40);
		obj.insertDataHead(30);
		obj.insertDataHead(20);
		obj.printList();
		
		
		
	}
	public  LinkedList() {
		this.head=null;
		this.tail=null;
	}
	
	public void insertDataHead(int data) {
		Node temp=new Node(data);
		if(head==null) {
			head=temp;
		}else {
			temp.next=head;
			head=temp;
		}
		
	}
	
	
	public void insertDataTail(int data) {
		Node temp=new Node(data);
		if(head==null) {
			head=temp;
		}else {
		Node current=head;
		while(current.next!=null) {
			current=current.next;
			
		 }	
		current.next=temp;
		 
		}
		
		
	}
	public void printList() {
		Node current=head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
		
		
	}

}
