package One;

import java.util.Arrays;

public class PrifixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrifixSum ob=new PrifixSum();
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(ob.prefixSum(arr)));
	}
	
	
	
	static int[] prefixSum(int arr[]) {
		int prefix[]=new int[arr.length];
		prefix[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			prefix[i]=prefix[i-1]+arr[i];
		}
		return prefix;
	}
	

}
