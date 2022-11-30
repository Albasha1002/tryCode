package One;

import java.util.Arrays;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rev ob=new Rev();
		
		int arr[]= {1,2,3,4,5,678,9};
		System.out.println(Arrays.toString(rev(arr)));
	}
	
	static int[] rev(int[] arr) {
		int first;
		int last;
		
		for(int i=0;i<arr.length/2;i++) {
			last=arr.length-i-1;
			first=i;
			
			int temp=arr[first];
			arr[first]=arr[last];
			arr[last]=temp;
		}
		
		
		return arr;
	}

}
