package One;

public class BinarSearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,43,44,45,97};
		 System.out.println(binarSearch(arr,45));

	}
	
	
	static int binarSearch(int arr[], int target) {
		int start=0;
		int end=arr.length-1;	
		for(int i=0;i<=end;i++){
			//int mid=start+(end-start)/2;
			boolean asc=arr[start]< arr[end];
			
			
			int mid=start+(end-start)/2;
			
			if(target==arr[mid]) {
				return mid;
			}
			if(asc) {
				if(target<arr[mid]){
					end=mid-1; 
				}else{
					start=mid+1;
				}
			}else {
				if(target<arr[mid]){
					start=mid+1;
				}else{
					end=mid-1;
				}
			}
		}
		return -1;
	}

}
