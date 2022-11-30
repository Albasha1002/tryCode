package One;

public class RepMis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       RepMis ob=new RepMis();
       int arr[]= {1,2,3,3,4};
       ob.mis(arr);
	}
	
	static void mis(int arr[]) {
		int sum=0;
		int sqSum=0;
		int n=arr.length+1;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			sqSum+=arr[i]*arr[i];
			
		}
		
		int r=(n*(n+1))/2;
		int r1=(n*(n+1)*(2*n+1))/6;
		
		int y=(((sqSum-r1)/(sum-r))+r-sum)/2;
		int x=sum-r+y;
		
		System.out.println(x+" "+y);
	}

}
