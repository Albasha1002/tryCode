package One;

public class FindZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=findZeros(12030);
		System.out.println(c);

	}
	 static int count=0;
	public static int findZeros(int n) {
		if(n%10==n){
			return n;
		}
		
		
		int rem=n%10;
		
		if(rem==0) {
			count++;
		}
		int nu=n/10;
		findZeros(nu);
		
		return count;
	}

}
