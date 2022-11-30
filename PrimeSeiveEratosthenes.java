package One;

import java.util.Arrays;

public class PrimeSeiveEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      knalSeive(36);
	}
	
	static void seivePrime(int n) {
		boolean[] bo=new boolean[n+1];
		for(int i=0;i<=n;i++) {
			bo[i]=true;
		}
		for(int p=2;p*p<=n;p++) {
			if(bo[p]==true) {
				for(int j=p*p;j<=n;j+=p) {
					bo[j]=false;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(bo[i]==true) {
				System.out.println(i+" ");
			}
		}
		
	}
	
	static void knalSeive(int n) {
		boolean[] bo=new boolean[n+1];
		for(int i=2;i*i<=n;i++) {
			if(!bo[i]){
				for(int j=i*2;j<=n;j+=i) {
					System.out.print(j+" ");
					bo[j]=true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(!bo[i]) {
				System.out.println(i+" ");
			}
		}
	}

}
