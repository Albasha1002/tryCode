package One;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,23,45,6,7,78};
		ArrayReverse obj=new  ArrayReverse();
		int arr1[]= obj.reverse(arr);
		System.out.println(Arrays.toString(arr1));
		
	}
	
	static int[] reverse(int arr[]) {
		int temp;
		for(int i=0;i<arr.length/2;i++) {
			int first=i;
			int last=arr.length-1-i;
			
			
				//swap(arr[first],arr[last]);
			temp=arr[first];
			arr[first]=arr[last];
			arr[last]=temp;
				
		}
	
		
		return arr;
		
		
	}
	
	

}
