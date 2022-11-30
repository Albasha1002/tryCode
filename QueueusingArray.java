package One;

public class QueueusingArray {
	int front;
			int rear;
			int arr[];
			int size;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueusingArray ob =new QueueusingArray(5);
		ob.enQu(5);
		ob.enQu(4);
		ob.enQu(0);
		
		
		
		while(!ob.isEmpty()) {
			System.out.println(ob.deQu());
		}
	}
	public QueueusingArray(int data) {
		this.front=0;
		this.rear=-1;
		this.arr=new int[data];
		this.size=0;
	}
	
	public void enQu(int data) {
		 arr[++rear]=data;
	}
	
	public int deQu() {
		
		return arr[front++];
		}
	public int peek() {
		return arr[front];
	}
	
	public boolean isEmpty() {
		return front>rear;
	}
	

}
