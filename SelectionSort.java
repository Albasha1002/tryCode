package One;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {10,9,4,3,21};
        System.out.println(Arrays.toString(selectionsort(arr)));
	}
	
	static int[] selectionsort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
		 
			int last=arr.length-i-1;
			int max=getMaxIndex(arr,0, last);
			swap(arr,max,last);
		}
		
		return arr;
	}
	
	static int getMaxIndex(int[] arr,int start,int end){
		int max=start;
		for(int i=0;i<=end;i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
			
		}
		
		return max;
	}
	
	static void swap(int[] arr, int first, int second) {
		
		 int temp=arr[first];
		 arr[first] = arr[second];
		 arr[second]=temp;
			
			
	}
}
