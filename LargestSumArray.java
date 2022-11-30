package One;

public class LargestSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-01,-1,3,4,5,6,7};
		System.out.println(largestSum(arr));
	}
	static int largestSum(int arr[]) {
		
		int max=Integer.MIN_VALUE;
		int meh=0;
		for(int i=0;i<arr.length;i++) {
			
			meh+=arr[i];
			
			if(max<meh) {
				max=meh;
			}
			if(meh<0) {
				meh=0;
			}
		}
		return max;
	}

}
