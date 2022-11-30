package One;

public class BinSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,5,6,6,6,6,6,616};
     System.out.println(binarySearch(arr, 6)+" BS");
     System.out.println(binarySearchFirstOccurence(arr, 6)+ " BS with first Occurence");
     System.out.println(binarySearchLastOccurence(arr, 6)+" Last Occurene");
	}
	static int binarySearch(int arr[], int k) {
		int l=0;
		int h=arr.length-1;
		
		
		while(l<=h) {
			int mid=l+(h-l)/2;
			
			if(arr[mid]==k) {
				
				return mid;
			}
			else if(arr[mid]<k) {
				l=mid+1;
			}else {
				h=mid-1;
			}
			
		}
		return -1;
	}
	static int binarySearchFirstOccurence(int arr[], int k) {
		int l=0;
		int r=arr.length-1;
		int found=0;
		int m=0;
		while(l<=r) {
			int mid=l+(r-l)/2;
			m=mid;
			
			if(arr[mid]==k) {
				 found=mid;
				r=mid-1;//First Occurence
				//l=mid+1;
				
			}
			else if(arr[mid]<k) {
				l=mid+1;
			}else {
				r=mid-1;
			}
			
		}
		return found;
	}
	static int binarySearchLastOccurence(int arr[], int k) {
		int l=0;
		int r=arr.length-1;
		int found=0;
		int m=0;
		while(l<=r) {
			int mid=l+(r-l)/2;
			m=mid;
			
			if(arr[mid]==k) {
				//h=mid-1;
				 found=mid;
				l=mid+1;//Last Occurence
				
			}
			else if(arr[mid]<k) {
				l=mid+1;
			}else {
				r=mid-1;
			}
			
		}
		return found;
	}
}
