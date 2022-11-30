package One;

public class SLL {
       Node top;
	
	 public SLL() {
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
	    public int pop() throws Exception {
	    	if(top==null) {
				throw new Exception("Stack is Empty");
			}
	    	int val=top.data;
	    	top=top.next;
	    	return val;
	    }
	    
	    public boolean isEmpty() {
	    	return (top==null);
	    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		SLL s=new SLL();
		
		s.push(5);
		s.push(4);
		
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
