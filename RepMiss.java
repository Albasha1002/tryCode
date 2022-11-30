package One;

public class RepMiss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,4};
		RepMiss obj=new RepMiss();
		System.out.println(obj.mis(arr));
		System.out.println(obj.squareMis(arr));
		System.out.println(obj.findA(arr));
		System.out.println(obj.findB(arr));

	}
	
	static int mis(int arr[]) {
		int sum=0;
		int n=arr.length+1;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		int r=(n*(n+1))/2;
		return r-sum;
	}
	
	static int squareMis(int arr[]) {
		int sum=0;
		int f=mis(arr);
		int n=arr.length+1;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i]*arr[i];
		}
		
		int r=(n*(n+1)*(2*n+1))/6;
		return (r-sum)/f;
	}
	
	static int findA(int arr[]) {
		int a=mis(arr);
		int b=squareMis(arr);
		return (a+b)/2;
	}
	static int findB(int arr[]) {
		int a=mis(arr);
		int b=squareMis(arr);
		return (a-b)/2;
	}

}
