package One;

public class Stack {
	int top;
	int arr[];
	int size;
	
	public Stack(int data) {
		this.arr=new int[data];
		this.size=0;
		this.top=-1;
        
	}
	
	
	public void push(int data) {
		arr[++top]=data;
		
	}
	
	public int pop() {
		return arr[top--];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stack st=new Stack(5);
       
       
       st.push(5);
       st.push(4);
       st.push(3);
       
       while(!st.isEmpty()) {
    	   System.out.println(st.pop());
       }
	}

}
