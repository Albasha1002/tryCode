package One;

public class PeakElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeakElem obj=new PeakElem();
		int arr[]= {1,3,2,4,6,5,7,9,8};
		
		System.out.println(obj.peakElem(arr));

	}
	
	static int peakElem(int arr[]) {
		
		int peak=Integer.MIN_VALUE;
	for(int i=1;i<arr.length-1;i++)
		if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
			peak=i;
		}
	 return peak;
	}
	
}
