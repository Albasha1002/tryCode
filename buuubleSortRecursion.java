package One;

import java.util.Arrays;

public class buuubleSortRecursion {

	public static void main(String[] args) {
		int arr[]= {6,5,4,3,2,1};
		bubblesort(arr.length-1, 0, arr);
        System.out.println(Arrays.toString(arr));
        
     
	}
	public static void bubblesort(int r,int c,int nums[]) {
		if(r==0) {
			return;
		}
		if(c<r) {
			if(nums[c]>nums[c+1]) {
				int temp=nums[c];
				nums[c]=nums[c+1];
				nums[c+1]=temp;
				
			}
			bubblesort(r, c+1, nums);
		}else {
			bubblesort(r-1, 0, nums);
		}
		
	}

}
