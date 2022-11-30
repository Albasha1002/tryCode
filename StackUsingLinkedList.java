package One;

public class StackUsingLinkedList {

	Node top;
	
	
	public StackUsingLinkedList(){
		this.top=null;
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
	
	public int pop() throws Exception{
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
		return(top==null);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingLinkedList st=new  StackUsingLinkedList();
		
		st.push(5);
		st.push(3);
		
		st.push(2);
		System.out.println(st.peek());
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		     
	}

}
