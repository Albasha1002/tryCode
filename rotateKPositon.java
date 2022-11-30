package One;

import java.util.Arrays;

public class rotateKPositon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
	 rotateKPositon ob=new rotateKPositon();
	 System.out.println(Arrays.toString(ob.te(arr, 3)));
	}
	
	static int[] te(int arr[],int r) {
		int low=0;
		int high=arr.length-1;
		int k=1;
		while(k<=r) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
			
			k++;
		}
		return arr;
		
		
	}
	
	static void swap(int i,int j) {
		
		int temp=i;
		i=j;
		j=temp;
	}

}
