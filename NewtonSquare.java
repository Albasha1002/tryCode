package One;

public class NewtonSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(newtonSquare(49));
	}
	
	static double newtonSquare(double n) {
		double x=n;
		double root;
				
				while(true) {
					root=0.5*(x+(n/x));
					
					if(Math.abs(root-x)<1) {
						break;
					}
					x=root;
				}
				return root;
	}
}
