package One;

public class celing {

	public static void main(String[] args) {
		int array[]= {'c','j','k','l'};
		char target='m';
		System.out.println(ceiling(array,target));

	}
	static int ceiling(int arr[],char target ) {
		int start=0;
		int end=arr.length - 1;
		
		while(start<=end){
			int mid = start+(end-start)/2;
			
			if(arr[mid]>target) {
				end=mid-1;
			}else 
				start=mid+1;
			}
		
		
		return arr[start % arr.length];
	}

}
