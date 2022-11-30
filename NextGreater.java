package One;

import java.util.Arrays;

public class NextGreater {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int arr[]= {1,23,2,45,5,6};
		System.out.println(Arrays.toString(nextGreatest(arr)));
		System.out.println("Replace Greatest Element");
		System.out.println(Arrays.toString(replaceNextGreatest(arr)));
	}
	
	
	public static  int[] nextGreatest(int arr[]) throws Exception {
		int nge[]=new int[arr.length];
	
		
		StackUsingLinkedList ob=new StackUsingLinkedList();
	
		for(int i=0;i<arr.length;i++) {
			
		while(!ob.isEmpty() && arr[i]>arr[ob.peek()]) {
			System.out.println(arr[ob.peek()]+" peek");
			
			nge[ob.peek()]=arr[i];
			System.out.println(ob.pop()); 
			
		}
		System.out.println(i+" basha");
		ob.push(i);
		
		
		
		}
		
		while(!ob.isEmpty()) {
			nge[ob.peek()]=-1;
			ob.pop();
		}
		return nge;
	}
	
	
	static int[] replaceNextGreatest(int arr[]) {
		
		int maxIndexValue=arr[arr.length-1];
		for(int i=arr.length-2;i>0;i--) {
			if(arr[i]<maxIndexValue) {
				arr[i]=maxIndexValue;
			}else {
				maxIndexValue=arr[i];
			}
		}
		return arr;
	}

}
