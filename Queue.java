package One;

public class Queue {

	int[] arr;
	int front;
	int rear;
	
	
	public Queue(int size) {
		this.arr=new int[size];
		this.front=0;
		this.rear=-1;
	}
	
	public void enQueue(int data) {
		arr[++rear]=data;
	}
	
	public int deQueue() {
		return arr[front++];
		
	}
	public int peek() {
		return arr[front];
	}
	
	
	
	public boolean isEmpty() {
		return front>rear;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Queue qu=new Queue(5);
      
       
       qu.enQueue(5);
       qu.enQueue(4);
       qu.enQueue(3);
       qu.enQueue(2);
       
       while(!qu.isEmpty()) {
    	   System.out.println(qu.deQueue());
    	   
       }
	}

}
