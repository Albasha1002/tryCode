package One;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeProblem {
	private static final int MAX_COUNT = 5;
	static List<String> arr=new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 print();
    
	}
	static void print() {
		
	java.util.Queue<String> ob1= new LinkedList();
	ob1.add("9");
	for(int count=0;count< MAX_COUNT;count++) {
		
		String s1=ob1.peek();
		ob1.remove();
		arr.add(s1);
		
		ob1.add(s1+ "0");
		System.out.println(ob1.peek()+"Peek");
		ob1.add(s1+"9");
		
	}
	
	}
	
	

}
