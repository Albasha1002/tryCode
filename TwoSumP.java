package One;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,3};
//		System.out.println(Arrays.deepToString(twoSum(arr, 18)));
		System.out.println(Arrays.asList(towSumm(arr, 18)));
	}
	
	static int[][] twoSum(int arr[], int target){
		int arrr[][]=new int[2][2];
		int value=0;
		HashMap<Integer, Integer> ob=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			value=target-arr[i];
		 if(ob.containsKey(value)) {
			
			 arrr[0][i]=value;
			 arrr[0][i+1]=arr[i];
			 
		 }else {
			 ob.put(arr[i],1);
		 }
	}
		return arrr;
	}
	static HashMap<Integer,Integer> towSumm(int arr[], int target){
		int arrr[][]=new int[2][2];
		int value=0;
		HashMap<Integer, Integer> ob=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			value=target-arr[i];
		 if(ob.containsKey(value)) {
			
			ob.put(value,i+1);
			 
		 }else {
			 ob.put(arr[i],1);
		 }
	}
		return ob;
	}
}
