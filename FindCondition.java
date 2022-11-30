package One;

public class FindCondition {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,67,8};
		
		// TODO Auto-generated method stub
 System.out.println(FindCondition(arr, 3));
	}
	
	static boolean FindCondition(int[] arr,int k) {
		int j=0;
		int i=0;
		while(i<arr.length && j<arr.length){
			
			if(arr[j]-arr[i]==k) {
				System.out.println(arr[j]);
				System.out.println(arr[i]);
				if(j==i) {
					i++;
				}
				return true;
			}else if((arr[j]-arr[i])<k) {
				j++;
			}else {
				i++;
			}
		}
		return false;
		}

}
