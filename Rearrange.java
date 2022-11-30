package One;

public class Rearrange {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,5,6,9,12};
		int[] arr1=rearrange(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr1[i]);
		}
	}
	
	public static int[] rearrange(int[] arr) {
		int j=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		
		return arr;
	}

}
