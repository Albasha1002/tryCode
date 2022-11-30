package One;

import java.util.Arrays;

public class RotateKPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9};
		RotateKPos ob=new RotateKPos();
		System.out.println(Arrays.toString(ob.ro1(arr, 3)));

	}
	
	static int[] rotate(int arr[],int k) {
		int arr1[]=new int[k];
		 
		for(int i=0;i<k;i++) {
			arr1[i]=arr[i];
		}
		return arr1;
	}
	
	static int[] ro1(int arr[],int k) {
		int[] ar=rotate(arr, k);
		for(int i=0;i<arr.length;i++) {
			if(i<k+3){
				arr[i]=arr[i+k];
				System.out.println(arr[i]);
				 
			}
			if(i>=k+3) {
				arr[i]=ar[i-k-3];
			}

			}
		
		
		return arr;
	}

}
