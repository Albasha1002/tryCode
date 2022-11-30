package One;

public class maxElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     maxElem obj=new maxElem();
     int arr[]= {1,2,3,4,5,678,9};
     int arr1=obj.maxelem(arr);
    System.out.println(arr1);
	}
	
	
	static int maxelem(int arr[]) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}else {
			min=arr[i];
		}
		}
		return max;
	}

}
