package One;

import java.util.Arrays;

public class Fibii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(Arrays.toString(fibii(5)));
	}
	
	static int [] fibii(int n) {
		int arr[]=new int[n+1];
		int i=2;
		int s=0;
		 arr[0]=1;
		 arr[1]=1;
		while(i<=n) {
			
			arr[i]=arr[i-1]+arr[i-2];
			System.out.println(arr[i]);
			
			i++;
		}
		return arr;
	}

}
