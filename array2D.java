package One;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array2D {

	public static void main(String[] args) {
		
			int[][] arr= {
					{2, 4, 6},
					{8, 10, 12},
					{14, 18, 16}
			};
			int [] ans=searchTarget(arr,10);
			
			
			System.out.println(Arrays.toString(ans));
			System.out.print(searchMax(arr));
		}
		
	static int[] searchTarget(int[][] arr,int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
					return new int[]{row,col};
				}
			}
		}
		return new int[]{ -1,-1};
	}
	static int searchMax(int arr[][]){
	int max=Integer.MIN_VALUE;
	for(int row=0;row<arr.length;row++) {
		for(int col=0;col<arr[row].length;col++) {
			if(arr[row][col]>max) {
				max=arr[row][col];
				
			}
		}
	}
	return max;
	}

}
