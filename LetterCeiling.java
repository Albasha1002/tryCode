package One;

public class LetterCeiling {

	public static void main(String[] args) {
		
		char letter[] = {'c','j','k','l'};
		char target='j';
		System.out.println(letter.length);
		System.out.println(ceiling(letter,target));
		
	}
	
	static int ceiling(char array[],char target ) {
		int start=0;
		int end=array.length - 1;
		
		while(start<=end){
			int mid = start+(end-start)/2;
			
			if(array[mid]>target) {
				end=mid-1;
			}else 
				start=mid+1;
			}
		
		
		return array[start % array.length];
	}

}
