package One;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		for(int i=0;i<=n;i++) {
			System.out.println(i+" "+isPrime(i));
		}
	}
	
	static boolean isPrime(int n) {
		int c=2;
		if(n<=1) {
			return false;
		}
			
			while(c*c<=n) {
				if(n%c==0){
					return false;
				}
				c++;
			}
			return true;
		}
	
	}


