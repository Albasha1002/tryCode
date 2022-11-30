package One;

public class QueueUsingLinkedList {

	Node front;
	Node rear;
		
	
	public QueueUsingLinkedList() {
		this.front=null;
		this.rear=null;
	}
	
	
	public void enQueue(int data) {
		Node temp=new Node(data);
		if(front==null) {
			front=temp;
			rear=temp;
		}else {
			rear.next=temp;
			rear=temp;
		}
	}
	
	public int deQueue() {
		int val=front.data;
		front=front.next;
		return val;
	}
	
	public boolean isEmpty() {
		return front==null;
	}
	
	public int peek() {
		return front.data;
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     QueueUsingLinkedList quL=new QueueUsingLinkedList();
     quL.enQueue(5);
     quL.enQueue(4);
     
     while(!quL.isEmpty()) {
    	 System.out.println(quL.deQueue());
     }
     
     
     
     
	}

}
