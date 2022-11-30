package One;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {6,5,4,1,2,3};
       System.out.println(sortedRotated(arr, 5));
	}
	public static int sortedRotated(int nums[],int target) {
		
		int pivot=findPivot(nums);
		
		if(pivot==-1) {
			return binarySearch(nums, target, 0,nums.length-1);
		}
		
		if(target>=nums[0]) {
			return binarySearch(nums, target, 0,pivot-1);
		}if(nums[pivot]==target) {
			return pivot;
		}else {
			return binarySearch(nums, target, pivot+1,nums.length-1);
		}
	}
	
	public static int findPivot(int nums[]) {
		int start=0;
		int end=nums.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(mid < end && nums[mid]>nums[mid+1]) {
				return mid;
			}
			if(mid>start && nums[mid]<nums[mid-1]) {
				return mid-1;
			}if(nums[mid]<=nums[start]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		
		return -1;
	}
	
	public static int binarySearch(int nums[],int target,int start, int end) {
		int mid=start+(end-start)/2;
		
		
		while(start<=end){
			
			if(target<nums[mid]){
				end=mid-1;
			}if(target>nums[mid]){
				start=mid+1;
			}if(target==nums[mid]){
				return mid;
			}
		}
		return -1;
	}

}
