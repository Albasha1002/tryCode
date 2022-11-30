package One;

public class StackusingArray {
	public  int top;
	public  int arr[];
	public int size=0;
	public StackusingArray(int size){
		this.top=-1;
		this.arr=new int[size];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackusingArray ob=new StackusingArray(5);
        ob.push(5);
        ob.push(4);
        ob.push(3);
        System.out.println(ob.peek());
        System.out.println(ob.size+"size");
        while(!ob.isEmpty()) {
       System.out.println(ob.pop());
        }
        
	}
	
	public void push(int data) {
		 arr[++top]=data;
		 size++;
	}
	
	public int pop() {
		size--;
		return arr[top--];
	}
	
	public  boolean isEmpty() {
		return top==-1;
	}
    public int peek() {
	  return arr[top];
  }
   
   
  
}
