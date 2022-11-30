package One;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println(squareRoot(25));
		int num=(int)(25/2);
		
		System.out.println(num);
		int sqrt=(12+(12/4))/2;
		System.out.println(sqrt);

	}
	
	public static int squareRoot(int num){
		int t;
		int sqrt=(int)(num/2);
		
		do {
			t=sqrt;
			sqrt=(int)(t+(num/t))/2;
		}while((t-sqrt)!=0);
		
		return sqrt;
	}

}
