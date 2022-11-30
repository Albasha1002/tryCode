package One;

import java.util.Arrays;

public class selectionRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,5,4,3,2,1};
		sorts( arr,arr.length-1, 0,0);
        System.out.println(Arrays.toString(arr));
        
	}
	static void sorts(int nums[],int r,  int c, int max) {
		if(r==0) {
			return;
		}
		if(c<r) {
			if(nums[c]>max) {
				int temp=nums[c];
				nums[c]=max;
				max=temp;
			}
			sorts(nums,r,c+1,max);
		}else {
			sorts(nums,r-1,c,max);
		}
	}

}
