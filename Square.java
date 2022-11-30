package One;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(square(40, 3));
	}
	
	static double square(int n,int p) {
		int s=0;
		int e=n;
		
		double root=0.0;
		
			double incr=0.1;
			for(int i=0;i<3;i++) {
				System.out.println(i+"i"
						+ "");
				while(root*root<=n) {
					System.out.println(root);
					root+=incr;
					
				}
				root-=incr;
                incr/=10;
			}
		
		
		
		return root;
	}

}
