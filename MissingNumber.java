package One;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[]
				= {1,2,3,4,5,6,7,9,8};
		
		int num=missingNum(arr);
		System.out.println(num);
	}
	
	public static int missingNum(int arr[]) {
		int sum=0;
		int length=arr.length;
		int n=length+ 1;
		int total= (n*((length+2)/2)) ;
	    System.out.println(total);
	    
	    for(int i=0;i<length;i++) {
	    	sum=sum+arr[i];
	    }
		return total-sum;
	}

}
