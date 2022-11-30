package One;

public class QueUsingL {
    Node front;
    Node rear;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    QueUsingL ob= new QueUsingL();
    ob.enQ(5);
    ob.enQ(4);
    ob.enQ(3);
    
    
    while(!ob.isEmpty()) {
    	System.out.println(ob.deQ());
    }
	}
	public QueUsingL() {
		// TODO Auto-generated constructor stub
		this.front=null;
		this.rear=null;
	}
	
	
	public void enQ(int data) {
		Node temp=new Node(data);
		if(front==null) {
			front=temp;
			rear=temp;
		}else {
			rear.next=temp;
			rear=temp;
			
		}
	}
	
	public int deQ() {
		int data=front.data;
		front=front.next;
		return data;
	}
	
	public boolean isEmpty() {
		return front==null;
	}
	 public int peek() {return front.data;}
	
	

}
