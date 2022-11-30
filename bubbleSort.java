package One;

import java.util.Arrays;

public class bubbleSort {
	
	
public static void main(String[] args ) {
	
	int arrs[]= {4,5,3,2,1};
	int[] arr=buubbleSort(arrs);
	System.out.println(Arrays.toString(arr));
	
}

static int[] buubbleSort(int[] matrix) {
	boolean swapped;
	boolean swap=true;
	
	for(int i=0;i<matrix.length;i++) {
		swapped=false;
		swap=swapped;
		for(int j=1;j<matrix.length-i;j++) {
			
			if(matrix[j]<matrix[j-1]) {
				
				int temp=matrix[j];
				matrix[j]=matrix[j-1];
				matrix[j-1]=temp;
				swapped=true;
				
			}
			
		}
		
		if(!swapped) {
			break;
		}
	}
	if(!swap) {
		return matrix;
	}
	
	return new int[] {-1,-1};
}

}
