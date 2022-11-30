package One;

import java.util.Arrays;

public class prefx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {1,2,3,4,5,6};
			prefx obj=new prefx();
			System.out.println(Arrays.toString(obj.prefx(arr)));
	}
	
	static int[] prefx(int arr[]) {
		
		int[] prefx = new int[arr.length];
		prefx[0]=arr[0];
		
		
		for(int i=1;i<arr.length;i++) {
			prefx[i]=prefx[i-1]+arr[i];
		}
		
		
		return prefx;
	}

}
