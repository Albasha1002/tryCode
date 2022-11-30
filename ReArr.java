package One;

import java.util.Arrays;

public class ReArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,2,2,2,0,0,0};
		ReArr obj=new ReArr();
		System.out.println(Arrays.toString(revArr(arr)));
		
	}
	
	
	static int[] revArr(int arr[]) {

	int low=0;
	int mid=0;
	int high=arr.length-1;
	
	
	
	while(mid<=high) {
		if(arr[mid]==0) {
			int temp=arr[low];
			arr[low]=arr[mid];
			arr[mid]=temp;
			mid++;low++;
		}else if(arr[mid]==1) {
			mid++;
		}else {
			int temp=arr[high];
			arr[high]=arr[mid];
			arr[mid]=temp;
			high--;
		}
	}
	return arr;
	}
	
	
}
