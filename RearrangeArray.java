package One;

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,2,2,2,0,0,0};
		RearrangeArray obj=new RearrangeArray();
		
		obj.reaarangeArray012(arr);
		
		

	}
	
	public void reaarangeArray012(int arr[]) {
		
		int low=0;
		int mid=0;
		int high=arr.length-1;
		
		
		while(mid<=high) {
			if(arr[mid]==0) {
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				mid++;low++;
			}else if(arr[mid]==1) {mid++;}
			else {
				int temp=arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
			}
		}
		
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
