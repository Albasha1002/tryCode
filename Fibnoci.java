package One;

public class Fibnoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(5));
	}
	static int fib(int n) {
		if(n==0 || n==1) {
			int n1=n;
			System.out.println(n1+"output 1");
			return 1;
			
		}
		 int fibi=fib(n-1)+fib(n-2);
		System.out.println(fibi+"output");
		return fibi;
	}

}
