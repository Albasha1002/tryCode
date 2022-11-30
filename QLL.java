package One;

public class QLL {
    Node front;
    Node rear;
    
    public QLL() {
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
    	return (front==null);
    }
	public static void main(String[] args){
		// TODO Auto-generated method stub
     QLL q=new QLL();
     
     q.enQueue(6);
     q.enQueue(5);
     
     while(!q.isEmpty()) {
    	 System.out.println(q.deQueue());
     }
	}

}
