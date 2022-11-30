package One;

public class UniqueNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,4,4,3,5,3,2,2,1};
      int num=unique(arr);
      System.out.println(num);
	}

	
	public static int unique(int arr[]) {
		
		int uni=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			uni=uni^arr[i];
		}
		return uni;
		
	}
}
