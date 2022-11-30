package One;

import java.util.Arrays;

public class peak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		peak ob=new peak();
		int arr[]= {1,3,2,4,6,5,7,9,8}; 
		System.out.println(ob.peak(arr));
		

	}
	
	static int peak(int[] arr ) {
		int peak=0;
		
		for(int i=1;i<arr.length-1;i++){
			if(arr[i-1]<arr[i]&& arr[i+1]<arr[i]) {
				peak=arr[i];
			}
		}
		
		return peak;
	}

}
