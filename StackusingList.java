package One;

public class StackusingList {
    
    Node top;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackusingList ob=new StackusingList();
		ob.push(5);;
		ob.push(4);
		ob.push(3);
		
		while(!ob.isEmpty()) {
			System.out.println(ob.pop());
			
		}
		
	}
	
	public StackusingList() {
		this.top=null;
	}
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
	}
	
	public void push(int data) {
		Node temp=new Node(data);
		if(top==null) {
			top=temp;
		}else {
		temp.next=top;
		top=temp;
		}
		
		
		
	}
	
	public int pop() throws Exception {
		if(top==null) {
			throw new Exception("Stack is Empty");
		}
		int data=top.data;
		top=top.next;
		
		return data;
	}
	
	public int peek() {
		return top.data;
	}
	
	public boolean isEmpty() {
		return( top==null);
	}

}
