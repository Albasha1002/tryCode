package One;

public class BinarySearch {

	public static void main(String[] args) {
		
		int array[]= {34,55,67,87,89};
		int target=68;
		System.out.println(ceilNo(array,target));

	}
	
	public static int ceilNo(int arr[],int No) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==No ) {
				return arr[i];
			}
		}
		return  No;
	}

}
